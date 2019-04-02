package irvine.oeis.a007;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007734 Period of repeating digits of 1/n in base 3.
 * @author Sean A. Irvine
 */
public class A007734 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while (n % 3 == 0) {
      n /= 3;
    }
    return n == 1 ? Z.ONE : new IntegersModMul(n).order(Z.THREE);
  }
}
