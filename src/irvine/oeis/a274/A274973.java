package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274973.
 * @author Sean A. Irvine
 */
public class A274973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274973() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 13, 55, 139});
  }
}
