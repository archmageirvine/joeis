package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164431.
 * @author Sean A. Irvine
 */
public class A164431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164431() {
    super(new long[] {1, 0, -1, 1, -1, 2}, new long[] {13, 21, 34, 54, 86, 139});
  }
}
