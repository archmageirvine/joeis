package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A007733 Period of binary representation of 1/n. Also, multiplicative order of 2 modulo the odd part of n (= A000265(n)).
 * @author Sean A. Irvine
 */
public class A007733 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z a(final Z nz) {
    return a(nz.intValueExact());
  }

  @Override
  public Z a(int n) {
    while ((n & 1) == 0) {
      n >>>= 1;
    }
    return Functions.ORDER.z(n, Z.TWO);
  }

  @Override
  public Z next() {
    long n = ++mN;
    while ((n & 1) == 0) {
      n >>>= 1;
    }
    return Functions.ORDER.z(n, Z.TWO);
  }
}
