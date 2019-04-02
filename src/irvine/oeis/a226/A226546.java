package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226546 Number of squares in all tilings of a 3 X n rectangle using integer sided square tiles.
 * @author Sean A. Irvine
 */
public class A226546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226546() {
    super(new long[] {-1, -4, -6, -2, 3, 2}, new long[] {0, 3, 12, 34, 98, 256});
  }
}
