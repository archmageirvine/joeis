package irvine.oeis.a142;
// Generated by gen_seq4.pl 2024-03-18/rowsum at 2024-03-19 22:50

import irvine.oeis.a143.A143200;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A142242 Row sums of A143200.
 * @author Georg Fischer
 */
public class A142242 extends RowSumSequence {

  /** Construct the sequence. */
  public A142242() {
    super(0, new A143200().skip(1));
  }
}
