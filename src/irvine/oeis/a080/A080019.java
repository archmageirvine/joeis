package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A080019 Positive integers such that the smallest real solution to x^n + x = 2*Pi*a(n) forms a monotonically increasing sequence as n grows.
 * @author Sean A. Irvine
 */
public class A080019 extends Sequence2 {

  private long mN = 1;
  private long mM = 0;
  private CR mRoot = CR.ZERO;

  @Override
  public Z next() {
    ++mN;
    if (mM > 4) {
      mM *= 2;
    }
    while (true) {
      ++mM;
      final CR root = new UnaryCrFunction() {
        @Override
        public CR execute(final CR x) {
          return x.pow(mN).add(x).subtract(CR.TAU.multiply(mM));
        }
      }.inverseMonotone(CR.ZERO, CR.THREE).execute(CR.ZERO);
      if (root.compareTo(mRoot) > 0) {
        mRoot = root;
        return Z.valueOf(mM);
      }
    }
  }
}
