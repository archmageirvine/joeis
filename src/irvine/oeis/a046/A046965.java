package irvine.oeis.a046;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046965 Cos(a(n)) decreases monotonically to -1.
 * @author Sean A. Irvine
 */
public class A046965 implements Sequence {

  private final Convergents mC = new Convergents(CR.PI);
  private long mN = 0;
  private final ArrayList<Z> mFrac = new ArrayList<>();
  private Z mPrev = Z.NEG_ONE;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
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
