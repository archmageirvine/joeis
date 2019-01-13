package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107966.
 * @author Sean A. Irvine
 */
public class A107966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107966() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 29, 320, 2100, 9898, 37044, 116928, 323730, 807675, 1851421});
  }
}
