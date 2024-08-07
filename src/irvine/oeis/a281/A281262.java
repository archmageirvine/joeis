package irvine.oeis.a281;
// Generated by gen_seq4.pl 2023-10-27/tuptraf at 2023-10-28 00:14

import irvine.math.z.Binomial;
import irvine.oeis.a000.A000166;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A281262 Number of permutations of [2n] with exactly n fixed points.
 * @author Georg Fischer
 */
public class A281262 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A281262() {
    super(0, (n, s) -> Binomial.binomial(2L * n, n).multiply(s[0]), "", new A000166());
  }
}
