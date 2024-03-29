package irvine.oeis.a294;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.a287.A287279;
import irvine.oeis.a287.A287280;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A294057 Number of set partitions of [n] such that the maximal absolute difference between consecutive elements within a block equals eight.
 * @author Georg Fischer
 */
public class A294057 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A294057() {
    super(9, (n, s) -> s[0].subtract(s[1]), "", new A287280().skip(9), new A287279().skip(9));
  }
}
