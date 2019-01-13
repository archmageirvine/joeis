package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243143.
 * @author Sean A. Irvine
 */
public class A243143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243143() {
    super(new long[] {1, -5, 7, 5, -23, 19, 7, -27, 27, -7, -19, 23, -5, -7, 5}, new long[] {1, 22, 170, 816, 2947, 8765, 22703, 52823, 113042, 225817, 426299, 766905, 1324282, 2206478, 3563770});
  }
}
