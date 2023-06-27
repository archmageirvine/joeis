package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124722 Number of ternary Lyndon words with exactly four 1's.
 * @author Sean A. Irvine
 */
public class A124722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124722() {
    super(5, new long[] {-64, 128, -32, -96, 76, 0, -20, 8}, new long[] {2, 9, 40, 137, 448, 1336, 3840, 10540});
  }
}
