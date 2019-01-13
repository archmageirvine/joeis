package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168240.
 * @author Sean A. Irvine
 */
public class A168240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168240() {
    super(new long[] {1, -3, 3}, new long[] {21, 67, 139});
  }
}
