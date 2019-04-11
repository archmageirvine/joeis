package irvine.oeis.a007;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007739 Period of repeating digits of <code>1/n</code> in base 8.
 * @author Sean A. Irvine
 */
public class A007739 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while ((n & 1) == 0) {
      n >>>= 1;
    }
    return n == 1 ? Z.ONE : new IntegersModMul(n).order(Z.EIGHT);
  }
}
