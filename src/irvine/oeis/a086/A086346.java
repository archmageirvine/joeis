package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086346 On a 3 X 3 board, the number of n-move paths for a chess king ending in a given corner square.
 * @author Sean A. Irvine
 */
public class A086346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086346() {
    super(new long[] {8, 12, 2}, new long[] {1, 3, 18});
  }
}
