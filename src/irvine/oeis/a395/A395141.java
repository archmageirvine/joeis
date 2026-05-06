package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395141 Square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals downwards, where A(n,k) = (2*n)! * [x^(2*n)] C(x)^k and C(x) satisfies C(x) = cosh( Integral C(x)^3 dx ).
 * @author Sean A. Irvine
 */
public class A395141 extends Sequence1 {

  private Z mGlobalMaxDen = Z.ZERO;
  private long mDen = 1;

  @Override
  public Z next() {
    while (true) {
      ++mDen;
      long localMaxNum = 0;
      Z localMaxDen = Z.ZERO;
      for (long num = 1; num < mDen; ++num) {
        Q frac = new Q(num, mDen);
        while (!frac.num().isOne()) {
          frac = frac.subtract(new Q(1, frac.den().divide(frac.num()).add(1)));
        }
        if (frac.den().compareTo(localMaxDen) > 0) {
          localMaxNum = num;
          localMaxDen = frac.den();
        }
      }
      if (localMaxDen.compareTo(mGlobalMaxDen) > 0) {
        mGlobalMaxDen = localMaxDen;
        return Z.valueOf(localMaxNum);
      }
    }
  }
}
