package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003961;

/**
 * A048673 Permutation of natural numbers: a(n) = (A003961(n)+1) / 2 [where A003961(n) shifts the prime factorization of n one step towards larger primes].
 * @author Sean A. Irvine
 */
public class A048673 extends A003961 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z a(final Z n) {
    return super.a(n).add(1).divide2();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

