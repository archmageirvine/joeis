package irvine.oeis.a341;
// manually 2026-11-22

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003961;

/**
 * A341528 a(n) = n * sigma(A003961(n)),
 * where A003961 shifts the prime factorization of n one step towards larger primes, and sigma is the sum of the divisors of n.
 * @author Georg Fischer
 */
public class A341528 extends AbstractSequence implements DirectSequence {

  private final DirectSequence mSeq;
  private long mN;

  /** Construct the sequence. */
  public A341528() {
    super(1);
    mSeq = new A003961();
    mN = 0L;
  }

  @Override
  public Z next() {
    return Functions.SIGMA.z(mSeq.next()).multiply(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.SIGMA.z(mSeq.a(n)).multiply(n);
  }

  @Override
  public Z a(final long n) {
    return Functions.SIGMA.z(mSeq.a(n)).multiply(n);
  }

}
