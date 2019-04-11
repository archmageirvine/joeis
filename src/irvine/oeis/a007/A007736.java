package irvine.oeis.a007;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007736 Period of repeating digits of <code>1/n</code> in base 5.
 * @author Sean A. Irvine
 */
public class A007736 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while (n % 5 == 0) {
      n /= 5;
    }
    return n == 1 ? Z.ONE : new IntegersModMul(n).order(Z.FIVE);
  }
}
