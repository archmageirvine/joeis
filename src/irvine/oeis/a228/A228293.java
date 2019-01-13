package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228293.
 * @author Sean A. Irvine
 */
public class A228293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228293() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 9, 1022, 29523, 349524, 2441405, 12093234, 47079207, 153391688, 435848049});
  }
}
