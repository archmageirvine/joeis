package irvine.oeis.a348;
// Generated by gen_seq4.pl dirtraf at 2024-02-05 19:10

import irvine.oeis.a003.A003961;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A348992 a(n) = A000265(sigma(n)) / gcd(sigma(n), A003961(n)), where A003961(n) is fully multiplicative with a(prime(k)) = prime(k+1), and sigma is the sum of divisors function.
 * @author Georg Fischer
 */
public class A348992 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A348992() {
    super(1, new A003961(), new A348993());
  }
}
