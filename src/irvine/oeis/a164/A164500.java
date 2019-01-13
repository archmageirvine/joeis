package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164500.
 * @author Sean A. Irvine
 */
public class A164500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164500() {
    super(new long[] {1, -1, 1, -1, 2}, new long[] {13, 21, 36, 60, 100});
  }
}
