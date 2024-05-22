package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007735 Period of base 4 representation of 1/n.
 * @author Sean A. Irvine
 */
public class A007735 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while ((n & 1) == 0) {
      n >>>= 1;
    }
    return Functions.ORDER.z(n, Z.FOUR);
  }
}
