package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A353763 a(n) = A353750(n) / gcd(A353749(n), A353750(n)).
 * @author Georg Fischer
 */
public class A353763 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A353763() {
    super(1, (n, s) -> s[0].divide(s[1]), "", new A353750(), new A353761());
  }
}
