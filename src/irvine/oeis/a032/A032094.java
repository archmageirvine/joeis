package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032094.
 * @author Sean A. Irvine
 */
public class A032094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032094() {
    super(new long[] {-1, 4, -2, -12, 17, 8, -28, 8, 17, -12, -2, 4}, new long[] {4, 16, 60, 160, 396, 848, 1716, 3200, 5720, 9696, 15912, 25152});
  }
}
