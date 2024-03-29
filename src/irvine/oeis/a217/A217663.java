package irvine.oeis.a217;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-07 21:51

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A217663 a(n) = A217662(n+2)/A217662(n) - 1, n &gt; 0.
 * @author Georg Fischer
 */
public class A217663 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A217663() {
    super(1, (n, s) -> s[0].divide(s[2]).subtract(1), "1, 3, 1", new A217662().skip(3), PREVIOUS, PREVIOUS);
  }
}
