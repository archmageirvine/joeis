package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164463.
 * @author Sean A. Irvine
 */
public class A164463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164463() {
    super(new long[] {1, 0, -1, 2}, new long[] {13, 20, 31, 50});
  }
}
