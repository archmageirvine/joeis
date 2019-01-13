package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164435.
 * @author Sean A. Irvine
 */
public class A164435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164435() {
    super(new long[] {1, 1, 0, 1, 1, 0, 1}, new long[] {13, 22, 37, 62, 104, 175, 295});
  }
}
