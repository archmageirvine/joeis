package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256239 Sum of all the parts in the partitions of <code>6n</code> into 6 parts.
 * @author Sean A. Irvine
 */
public class A256239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256239() {
    super(new long[] {1, -3, 1, 5, -5, -3, 9, -3, -10, 10, 3, -9, 3, 5, -5, -1, 3}, new long[] {0, 6, 132, 1044, 4776, 15960, 43416, 102144, 215712, 419040, 761520, 1310628, 2155752, 3412656, 5228076, 7784910, 11307648});
  }
}
