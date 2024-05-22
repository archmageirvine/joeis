package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007739 Period of repeating digits of 1/n in base 8.
 * @author Sean A. Irvine
 */
public class A007739 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while ((n & 1) == 0) {
      n >>>= 1;
    }
    return Functions.ORDER.z(n, Z.EIGHT);
  }
}
