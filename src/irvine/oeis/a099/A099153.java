package irvine.oeis.a099;
// Generated by gen_seq4.pl 2024-03-26/prepend at 2024-03-26 23:22

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A099153 Iterated heptagonal numbers (A000566), starting at 7.
 * @author Georg Fischer
 */
public class A099153 extends PrependSequence {

  /** Construct the sequence. */
  public A099153() {
    super(0, new TupleTransformSequence(0, (n, s) -> s[0].multiply(5).subtract(3).multiply(s[0]).divide(2), "7", TupleTransformSequence.PREVIOUS), 1);
  }
}
