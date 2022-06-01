package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037242 Molien series for 3-D group R2+R3.
 * @author Sean A. Irvine
 */
public class A037242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037242() {
    super(new long[] {-1, 0, 2, 2, -1, -4, -1, 2, 2, 0}, new long[] {1, 1, 4, 8, 17, 23, 43, 58, 84, 113});
  }
}
