package irvine.oeis.a193;
// Generated by gen_seq4.pl robots/rowsums at 2023-08-10 08:11

import irvine.oeis.a076.A076731;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A193464 Row sums of triangle A076731.
 * @author Georg Fischer
 */
public class A193464 extends RowSumSequence {

  /** Construct the sequence. */
  public A193464() {
    super(1, new A076731());
  }
}
