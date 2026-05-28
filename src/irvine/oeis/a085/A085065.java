package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085065 a(1) = 4, a(n) = smallest number of the form k*a(n-1) +1 with the same prime signature p^2, where p is a prime.
 * @author Sean A. Irvine
 */
public class A085065 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
    } else {
      long k = 0;
      while (true) {
        final Z t = mA.multiply(++k);
        final Z tm = t.subtract(1);
        if (tm.isProbablePrime()) {
          mA = tm.square();
          break;
        }
        final Z tp = t.add(1);
        if (tp.isProbablePrime()) {
          mA = tp.square();
          break;
        }
      }
    }
    return mA;
  }
}
