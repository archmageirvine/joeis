package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002586 Smallest prime factor of 2^n + 1.
 * @author Sean A. Irvine
 */
public class A002586 implements Sequence {

  // least prime factor
  static Z lpf(final Z n) {
    if (Z.ONE.equals(n)) {
      return Z.ONE;
    } else if (n.isEven()) {
      return Z.TWO;
    } else if (n.mod(3) == 0) {
      return Z.THREE;
    } else if (n.mod(5) == 0) {
      return Z.FIVE;
    } else if (n.mod(7) == 0) {
      return Z.SEVEN;
    } else if (n.isProbablePrime()) {
      return n;
    } else {
      return Jaguar.factor(n).leastPrimeFactor();
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    return lpf(Z.ONE.shiftLeft(++mN).add(1));
  }
}
