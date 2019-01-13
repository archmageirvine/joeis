package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192736.
 * @author Sean A. Irvine
 */
public class A192736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192736() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 4, 12, 28, 50, 84, 133, 192});
  }
}
