package irvine.oeis.a353;
// manually 2024-01-17

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a064.A064989;

/**
 * A353749 a(n) = phi(n) * A064989(n), where phi is Euler totient function, and A064989 shifts the prime factorization one step towards lower primes.
 * @author Georg Fischer
 */
public class A353749 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final A064989 mSeq = new A064989();

  /** Construct the sequence. */
  public A353749() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return Functions.PHI.z(n).multiply(mSeq.a(n));
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

