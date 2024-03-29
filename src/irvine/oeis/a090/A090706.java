package irvine.oeis.a090;
// Generated by gen_seq4.pl 2023-10-27/tuptraf at 2023-10-28 00:14

import irvine.math.z.Binomial;
import irvine.oeis.a023.A023416;
import irvine.oeis.a070.A070939;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A090706 Number of numbers having in binary representation the same number of zeros and ones as n has.
 * @author Georg Fischer
 */
public class A090706 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A090706() {
    super(0, (n, s) -> Binomial.binomial(s[0].subtract(1), s[1]), "1", new A070939().skip(1), new A023416().skip(1));
  }
}
