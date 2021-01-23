package irvine.oeis.a007;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007732 Period of decimal representation of 1/n.
 * @author Sean A. Irvine
 */
public class A007732 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    while ((n & 1) == 0) {
      n >>>= 1;
    }
    while (n % 5 == 0) {
      n /= 5;
    }
    return n == 1 ? Z.ONE : new IntegersModMul(n).order(Z.TEN);
  }
}
