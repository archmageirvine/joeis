package irvine.oeis.a007;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007733 Period of binary representation of <code>1/n</code>. Also, multiplicative order of 2 modulo the odd part of <code>n (=</code> A000265(n)).
 * @author Sean A. Irvine
 */
public class A007733 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while ((n & 1) == 0) {
      n >>>= 1;
    }
    return n == 1 ? Z.ONE : new IntegersModMul(n).order(Z.TWO);
  }
}
