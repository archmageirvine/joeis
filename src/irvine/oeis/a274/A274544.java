package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274544.
 * @author Sean A. Irvine
 */
public class A274544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274544() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {1, 13, 925, 18241, 1333345});
  }
}
