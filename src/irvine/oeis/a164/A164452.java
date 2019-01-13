package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164452.
 * @author Sean A. Irvine
 */
public class A164452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164452() {
    super(new long[] {1, -2, 1, 1, -3, 3}, new long[] {13, 21, 32, 48, 70, 101});
  }
}
