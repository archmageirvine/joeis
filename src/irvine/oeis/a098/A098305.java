package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098305.
 * @author Sean A. Irvine
 */
public class A098305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098305() {
    super(new long[] {-1, 6, 6}, new long[] {0, 1, 5});
  }
}
