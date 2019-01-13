package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164447.
 * @author Sean A. Irvine
 */
public class A164447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164447() {
    super(new long[] {-1, 0, 2, -2, 0, 2}, new long[] {13, 21, 33, 54, 88, 144});
  }
}
