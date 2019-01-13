package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164404.
 * @author Sean A. Irvine
 */
public class A164404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164404() {
    super(new long[] {2, -2, 0, 2}, new long[] {14, 24, 41, 70});
  }
}
