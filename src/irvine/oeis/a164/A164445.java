package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164445.
 * @author Sean A. Irvine
 */
public class A164445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164445() {
    super(new long[] {-1, 0, 1, 0, 1, 1}, new long[] {13, 22, 38, 66, 113, 193});
  }
}
