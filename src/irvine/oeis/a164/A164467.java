package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164467.
 * @author Sean A. Irvine
 */
public class A164467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164467() {
    super(new long[] {-1, 2, -2, 0, 2}, new long[] {13, 20, 31, 48, 74});
  }
}
