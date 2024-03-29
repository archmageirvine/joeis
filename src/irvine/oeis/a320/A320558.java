package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.a276.A276723;
import irvine.oeis.a276.A276724;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A320558 Number of set partitions of [n] such that for each block b the smallest integer interval containing b has at most eight elements and for at least one block c the smallest integer interval containing c has exactly eight elements.
 * @author Georg Fischer
 */
public class A320558 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A320558() {
    super(8, (n, s) -> s[0].subtract(s[1]), "", new A276724().skip(8), new A276723().skip(8));
  }
}
