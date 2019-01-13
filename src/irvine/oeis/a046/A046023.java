package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046023.
 * @author Sean A. Irvine
 */
public class A046023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046023() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 12, 87, 416, 1475, 4236});
  }
}
