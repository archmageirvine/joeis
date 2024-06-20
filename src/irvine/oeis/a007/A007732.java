package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A007732 Period of decimal representation of 1/n.
 * @author Sean A. Irvine
 */
public class A007732 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z a(final Z k) {
    Z n = k;
    while (!n.testBit(0)) {
      n = n.divide2();
    }
    while (n.mod(5) == 0) {
      n = n.divide(5);
    }
    return n.equals(Z.ONE) ? Z.ONE : new IntegersModMul(n).order(Z.TEN);
  }

  @Override
  public Z a(final int k) {
    long n = k;
    while ((n & 1) == 0) {
      n >>>= 1;
    }
    while (n % 5 == 0) {
      n /= 5;
    }
    return Functions.ORDER.z(n, Z.TEN);
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
