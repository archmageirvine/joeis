package irvine.oeis.a208;
// Generated by gen_seq4.pl 2025-06-16.ack/rowsum at 2025-06-16 21:55

import irvine.oeis.a008.A008975;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A208278 Row sums of Pascal's triangle mod 10 (A008975).
 * @author Georg Fischer
 */
public class A208278 extends RowSumSequence {

  /** Construct the sequence. */
  public A208278() {
    super(0, new A008975());
  }
}
