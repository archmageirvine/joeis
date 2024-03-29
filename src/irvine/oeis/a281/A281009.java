package irvine.oeis.a281;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.a001.A001227;
import irvine.oeis.a067.A067742;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A281009 Number of odd divisors of n minus the number of middle divisors of n.
 * @author Georg Fischer
 */
public class A281009 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A281009() {
    super(1, (n, s) -> s[0].subtract(s[1]), "", new A001227(), new A067742());
  }
}
