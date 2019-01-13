package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164451.
 * @author Sean A. Irvine
 */
public class A164451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164451() {
    super(new long[] {-1, 1, 0, 0, -1, 0, 2}, new long[] {13, 21, 34, 56, 93, 156, 261});
  }
}
