package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164439.
 * @author Sean A. Irvine
 */
public class A164439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164439() {
    super(new long[] {1, -1, 2, -1, 1, 1}, new long[] {13, 21, 34, 56, 92, 151});
  }
}
