package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059524 Number of nonzero 4 X n binary arrays with all 1's connected.
 * @author Sean A. Irvine
 */
public class A059524 extends LinearRecurrence {

  // WARNING: Conjectural

  /** Construct the sequence. */
  public A059524() {
    super(new long[] {1, 11, -96, 162, -198, 255, 65, -632, 623, -75, -272, 230, -90, 17},
      new long[] {0, 10, 108, 1126, 11506, 116166, 1168586, 11749134, 118127408, 1187692422, 11941503498L, 120064335342L, 1207171430452L, 12137349489598L});
  }
}
