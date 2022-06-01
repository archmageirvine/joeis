package irvine.oeis.a207;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A207995 Number of nX6 0..2 arrays with new values 0..2 introduced in row major order and no element equal to any horizontal or vertical neighbor (colorings ignoring permutations of colors).
 * @author Sean A. Irvine
 */
public class A207995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207995() {
    super(new long[] {516, -2152, 3519, -2901, 1278, -291, 30}, new long[] {16, 243, 3891, 63267, 1034073, 16932816, 277458045});
  }
}
