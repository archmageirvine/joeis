package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164448.
 * @author Sean A. Irvine
 */
public class A164448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164448() {
    super(new long[] {1, -1, 0, -1, 0, 2}, new long[] {13, 21, 33, 51, 77, 116});
  }
}
