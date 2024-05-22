package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007736 Period of repeating digits of 1/n in base 5.
 * @author Sean A. Irvine
 */
public class A007736 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while (n % 5 == 0) {
      n /= 5;
    }
    return Functions.ORDER.z(n, Z.FIVE);
  }
}
