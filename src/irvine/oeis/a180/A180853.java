package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180853.
 * @author Sean A. Irvine
 */
public class A180853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180853() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {4, 6, 9, 7, 5});
  }
}
