package irvine.oeis.a326;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a003.A003973;
import irvine.oeis.a064.A064989;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A326042 a(n) = A064989(sigma(A003961(n))), where A003961 shifts the prime factorization of n one step towards larger primes, and A064989 shifts it back towards smaller primes.
 * @author Georg Fischer
 */
public class A326042 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A326042() {
    super(1, new A064989(), new A003973());
  }
}
