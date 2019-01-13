package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168555.
 * @author Sean A. Irvine
 */
public class A168555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168555() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 288, 10206, 133120, 984375, 5062176, 20235628, 67239936, 193975965});
  }
}
