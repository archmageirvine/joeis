package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257713 Triangular numbers (A000217) that are the sum of ten consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A257713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257713() {
    super(1, new long[] {1, -1, 0, 0, -1442, 1442, 0, 0, 1}, new long[] {1485, 7260, 28920, 142845, 2112540, 10440165, 41673885, 205953660, 3046252485L});
  }
}
