package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007738 Period of repeating digits of 1/n in base 7.
 * @author Sean A. Irvine
 */
public class A007738 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while (n % 7 == 0) {
      n /= 7;
    }
    return Functions.ORDER.z(n, Z.SEVEN);
  }
}
