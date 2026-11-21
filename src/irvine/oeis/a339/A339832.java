package irvine.oeis.a339;

import irvine.oeis.a401.A401210;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A339832 Number of bicolored graphs on n unlabeled nodes such that black nodes are not adjacent to each other.
 * @author Gregory Morse
 */
public class A339832 extends RowSumSequence {
  /** Construct the sequence. */
  public A339832() {
    super(new A401210());
  }
}
