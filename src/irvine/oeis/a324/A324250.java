package irvine.oeis.a324;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.a002.A002559;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A324250 Sequence a(n) = 3*A002559(n) - 2 determining the principal reduced indefinite binary quadratic form [1, a(n), -a(n)] for Markoff triples.
 * @author Georg Fischer
 */
public class A324250 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A324250() {
    super(1, new A002559(), v -> v.multiply(3).subtract(2));
  }
}
