package irvine.oeis.a341;
// manually 2026-11-22

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003961;


/**
 * A341529 a(n) = sigma(n) * A003961(n),
 * where A003961 shifts the prime factorization of n one step towards larger primes, and sigma is the sum of the divisors of n.
 * @author Georg Fischer
 */
public class A341529 extends AbstractSequence implements DirectSequence {

  private final DirectSequence mSeq;
  private long mN;

  /** Construct the sequence. */
  public A341529() {
    super(1);
    mSeq = new A003961();
    mN = 0L;
  }

  @Override
  public Z next() {
    return mSeq.next().multiply(Functions.SIGMA.z(++mN));
  }

  @Override
  public Z a(final Z n) {
    return mSeq.a(n).multiply(Functions.SIGMA.z(n));
  }

  @Override
  public Z a(final long n) {
    return mSeq.a(n).multiply(Functions.SIGMA.z(n));
  }

}
