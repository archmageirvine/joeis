package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064281 Least k such that k*10^n+1, k*10^n+3, k*10^n+7 and k*10^n+9 are all prime.
 * @author Sean A. Irvine
 */
public class A064281 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    long k = 0;
    while (true) {
      final Z t = mA.multiply(++k);
      if (t.add(1).isProbablePrime() && t.add(3).isProbablePrime() && t.add(7).isProbablePrime() && t.add(9).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
