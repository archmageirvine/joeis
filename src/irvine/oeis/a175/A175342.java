package irvine.oeis.a175;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a000.A000005;
import irvine.oeis.a049.A049988;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A175342 Number of arithmetic progressions (where the difference between adjacent terms is either positive, 0, or negative) of positive integers that sum to n.
 * @author Georg Fischer
 */
public class A175342 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A175342() {
    super(1, (n, s) -> s[0].multiply(2).subtract(s[1]), "", new A049988().skip(1), new A000005());
  }
}
