package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048058.
 * @author Sean A. Irvine
 */
public class A048058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048058() {
    super(new long[] {1, -3, 3}, new long[] {11, 13, 17});
  }
}
