package irvine.oeis.a007;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007738 Period of repeating digits of <code>1/n</code> in base 7.
 * @author Sean A. Irvine
 */
public class A007738 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while (n % 7 == 0) {
      n /= 7;
    }
    return n == 1 ? Z.ONE : new IntegersModMul(n).order(Z.SEVEN);
  }
}
