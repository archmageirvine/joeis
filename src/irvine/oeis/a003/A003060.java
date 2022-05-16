package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A003060 Smallest number with reciprocal of period n.
 * @author Sean A. Irvine
 */
public class A003060 implements Sequence {

  private long mN = -1;
  private Z mTen = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mTen = mTen.multiply(10);
    final Z[] divisors = Jaguar.factor(mTen.subtract(1)).divisorsSorted();
    // skip 1 | 10^n-1
    for (int k = 1; k < divisors.length; ++k) {
      ZUtils.valuation(Z.TEN, divisors[k]);
      boolean ok = true;
      Z t = Z.ONE;
      for (int j = 1; j < mN; ++j) {
        t = t.multiply(10);
        if (t.subtract(1).mod(divisors[k]).isZero()) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return divisors[k];
      }
    }
    throw new RuntimeException();
  }
}
