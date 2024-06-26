package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-03-30/tuptraf at 2024-03-30 20:29

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A353761 a(n) = gcd(A353749(n), A353750(n)), where A353749(n) = phi(n)*A064989(n), and A353750(n) = A353749(sigma(n)).
 * @author Georg Fischer
 */
public class A353761 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A353761() {
    super(1, (n, s) -> s[0].gcd(s[1]), "", new A353749(), new A353750());
  }
}
