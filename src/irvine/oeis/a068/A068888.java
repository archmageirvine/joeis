package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068888 Squares with property that digits alternate in parity individually as well as in concatenation with previous terms.
 * @author Sean A. Irvine
 */
public class A068888 extends Sequence0 {

  protected Z mN = Z.ZERO;
  protected Z mPrev = Z.ZERO;

  protected boolean is(Z n) {
    boolean parity = n.isEven();
    while (true) {
      n = n.divide(10);
      if (n.isZero()) {
        return parity == mPrev.isOdd();
      }
      if (n.isEven() == parity) {
        return false;
      }
      parity = !parity;
    }
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (is(s)) {
        mPrev = s;
        return s;
      }
    }
  }
}
