package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191007.
 * @author Sean A. Irvine
 */
public class A191007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191007() {
    super(new long[] {-4, 0, 3}, new long[] {3, 9, 27});
  }
}
