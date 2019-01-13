package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122911.
 * @author Sean A. Irvine
 */
public class A122911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122911() {
    super(new long[] {-1024, -320, 120, 10}, new long[] {1, 5, 139, 1645});
  }
}
