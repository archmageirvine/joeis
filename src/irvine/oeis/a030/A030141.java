package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030141 Numbers in which parity of the decimal digits alternates.
 * @author Sean A. Irvine
 */
public class A030141 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  static boolean isOk(Z n) {
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
    while (true) {
      mN = mN.add(1);
      if (isOk(mN)) {
        return mN;
      }
    }
  }
}
