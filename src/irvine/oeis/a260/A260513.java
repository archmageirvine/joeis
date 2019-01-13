package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260513.
 * @author Sean A. Irvine
 */
public class A260513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260513() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 9, 46, 164, 460, 1091});
  }
}
