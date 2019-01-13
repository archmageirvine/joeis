package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090392.
 * @author Sean A. Irvine
 */
public class A090392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090392() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 720, 1812, 3428, 5768, 9090, 13721});
  }
}
