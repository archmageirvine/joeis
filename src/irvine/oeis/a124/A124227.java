package irvine.oeis.a124;
// Generated by gen_seq4.pl A328988/tuptraf at 2023-12-23 19:03

import irvine.oeis.a000.A000041;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A124227 Number of partitions of n with even crank.
 * @author Georg Fischer
 */
public class A124227 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A124227() {
    super(0, (n, s) -> s[0].add(s[1]).divide(2), "", new A000041(), new A124226());
  }
}
