package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191903 Number of compositions of odd natural numbers into 4 parts &lt;=n.
 * @author Sean A. Irvine
 */
public class A191903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191903() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 8, 40, 128, 312, 648});
  }
}
