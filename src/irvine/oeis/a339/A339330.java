package irvine.oeis.a339;
// Generated by gen_seq4.pl 2024-07-16/rowsum at 2024-07-16 22:37

import irvine.oeis.a283.A283681;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A339330 Sums of antidiagonals in A283681.
 * @author Georg Fischer
 */
public class A339330 extends RowSumSequence {

  /** Construct the sequence. */
  public A339330() {
    super(1, new A283681());
  }
}
