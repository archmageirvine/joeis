package irvine.oeis.a363;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a001.A001221;
import irvine.oeis.a008.A008472;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A363895 Floor of the average of the distinct prime factors of n.
 * @author Georg Fischer
 */
public class A363895 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A363895() {
    super(2, (n, s) -> s[0].divide(s[1]), "", new A008472().skip(1), new A001221().skip(1));
  }
}
