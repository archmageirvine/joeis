package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059215 Least number k such that k^n reversed is a prime.
 * @author Sean A. Irvine
 */
public class A059215 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ONE;
    while (true) {
      k = k.add(1);
      if (Functions.REVERSE.z(k.pow(mN)).isProbablePrime()) {
        return k;
      }
    }
  }
}
