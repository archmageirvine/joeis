package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164479.
 * @author Sean A. Irvine
 */
public class A164479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164479() {
    super(new long[] {-1, 2, -1, -1, 0, 2}, new long[] {13, 21, 34, 54, 85, 133});
  }
}
