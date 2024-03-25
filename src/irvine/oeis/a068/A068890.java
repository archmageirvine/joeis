package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068890 a(1) = 1; a(n) = smallest nontrivial n-th power with property that digits alternate in parity.
 * @author Sean A. Irvine
 */
public class A068890 extends Sequence1 {

  private int mN = 0;

  private boolean is(Z n) {
    boolean parity = n.isEven();
    while (true) {
      n = n.divide(10);
      if (n.isZero()) {
        return true;
      }
      if (n.isEven() == parity) {
        return false;
      }
      parity = !parity;
    }
  }

  @Override
  public Z next() {
    if (mN == 9) {
      return null; // a(10) does not exist, sequence if finite
    }
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      final Z s = Z.valueOf(++k).pow(mN);
      if (is(s)) {
        return s;
      }
    }
  }
}
