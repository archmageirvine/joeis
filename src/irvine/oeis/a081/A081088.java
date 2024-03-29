package irvine.oeis.a081;
// Generated by gen_seq4.pl 2024-02-13/tuptraf at 2024-02-13 21:05

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A081088 Smallest partial quotients of a series of continued fractions that have a sum of unity, where the n-th continued fraction term is [0; a(n),a(n-1),...,a(1)], so that sum(n&gt;0, [0; a(n),a(n-1),...,a(1)] ) = 1, with a(1)=2.
 * @author Georg Fischer
 */
public class A081088 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A081088() {
    super(1, (n, s) -> s[0].multiply(s[1]), "2, 2", new A081090().skip(1), PREVIOUS);
  }
}
