package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189236.
 * @author Sean A. Irvine
 */
public class A189236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189236() {
    super(new long[] {-1, -4, -2, 5, 2}, new long[] {5, 2, 14, 32, 114});
  }
}
