package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064432 Least k such that k*10^n-9, k*10^n-7, k*10^n-3 and k*10^n-1 are all prime.
 * @author Sean A. Irvine
 */
public class A064432 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    long k = 0;
    while (true) {
      final Z t = mA.multiply(++k);
      if (t.subtract(1).isProbablePrime() && t.subtract(3).isProbablePrime() && t.subtract(7).isProbablePrime() && t.subtract(9).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
