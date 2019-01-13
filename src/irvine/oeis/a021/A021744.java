package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021744.
 * @author Sean A. Irvine
 */
public class A021744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021744() {
    super(new long[] {-120, 194, -89, 16}, new long[] {1, 16, 167, 1442});
  }
}
