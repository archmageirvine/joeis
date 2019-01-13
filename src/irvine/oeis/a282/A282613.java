package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282613.
 * @author Sean A. Irvine
 */
public class A282613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282613() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 140, 4995, 65824, 489125, 2521476, 10092775, 33562880, 96870249});
  }
}
