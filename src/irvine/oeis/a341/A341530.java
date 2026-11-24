package irvine.oeis.a341;
// manually 2026-11-22

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003961;

/**
 * A341530 a(n) = gcd(n*sigma(A003961(n)), sigma(n)*A003961(n)), where A003961 shifts the prime factorization of n one step towards larger primes, and sigma is the sum of divisors of n.
 * where A003961 shifts the prime factorization of n one step towards larger primes, and sigma is the sum of divisors of n.
 * @author Georg Fischer
 */
public class A341530 extends AbstractSequence implements DirectSequence {

  private final DirectSequence mSeq;
  private long mN;

  /** Construct the sequence. */
  public A341530() {
    super(1);
    mSeq = new A003961();
    mN = 0L;
  }

  @Override
  public Z next() {
    ++mN;
    final Z t61 = mSeq.next();
    return Functions.GCD.z(Functions.SIGMA.z(t61).multiply(mN), Functions.SIGMA.z(mN).multiply(t61));
  }

  @Override
  public Z a(final Z n) {
    final Z t61 = mSeq.a(n);
    return Functions.GCD.z(Functions.SIGMA.z(t61).multiply(n), Functions.SIGMA.z(n).multiply(t61));
  }

  @Override
  public Z a(final long n) {
    final Z t61 = mSeq.a(n);
    return Functions.GCD.z(Functions.SIGMA.z(t61).multiply(n), Functions.SIGMA.z(n).multiply(t61));
  }

}
