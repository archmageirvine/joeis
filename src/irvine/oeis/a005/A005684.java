package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005684 Number of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005684() {
    super(new long[] {-1, 0, 0, -2, 3, -2, 0, 2}, new long[] {1, 2, 4, 6, 11, 18, 32, 52});
  }
}

