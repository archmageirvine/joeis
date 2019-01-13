package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164550.
 * @author Sean A. Irvine
 */
public class A164550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164550() {
    super(new long[] {-3, 6}, new long[] {1, 7});
  }
}
