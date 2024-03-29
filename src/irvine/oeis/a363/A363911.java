package irvine.oeis.a363;
// Generated by gen_seq4.pl 2024-03-05/tuptraf at 2024-03-06 21:53

import irvine.oeis.a000.A000112;
import irvine.oeis.a000.A000142;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A363911 n! times the number of posets with n unlabeled elements.
 * @author Georg Fischer
 */
public class A363911 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A363911() {
    super(0, (n, s) -> s[0].multiply(s[1]), "", new A000142(), new A000112());
  }
}
