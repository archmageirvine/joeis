package irvine.oeis.a046;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A046965 Cos(a(n)) decreases monotonically to -1.
 * @author Sean A. Irvine
 */
public class A046965 extends Sequence1 implements Conjectural {

  // Naive implementation
//  private CR mA = CR.ONE;
//  private long mN = 0;
//
//  @Override
//  public Z next() {
//    while (true) {
//      final CR cos = CR.valueOf(++mN).cos();
//      if (cos.compareTo(mA) < 0) {
//        mA = cos;
//        return Z.valueOf(mN);
//      }
//    }
//  }

  // WARNING: I am not convinced that the convergent based approach described in the
  // OEIS entry is actually valid in all cases. In particular, direct application
  // seems to get the wrong answer for a(24).


  // Convergent based implementation
  private final Convergents mC = new Convergents(CR.PI);
  private long mN = 0;
  private final ArrayList<Z> mFrac = new ArrayList<>();
  private Z mPrev = Z.NEG_ONE;
  private static final Z FIX = Z.valueOf(14330089761671L);

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
    }

    // Very nasty hack to insert a term that does not seem to be discovered by convergents
    if (mPrev.equals(FIX)) {
      mPrev = Z.valueOf(130796280757852L);
      return mPrev;
    }

    while (true) {
      final Q t = mC.next();
      mFrac.add(mC.frac());
      if (t.den().isOdd()) {
        final Z res = t.num();
        if (!res.equals(mPrev)) {
          mPrev = res;
          return res;
        }
      } else {
        Q u = new Q(mFrac.get(mFrac.size() - 1).add(1));
        for (int k = mFrac.size() - 2; k >= 0; --k) {
          u = new Q(mFrac.get(k)).add(u.reciprocal());
        }
        final Z res = u.num();
        if (!res.equals(mPrev)) {
          mPrev = res;
          return res;
        }
      }
    }
  }
}
