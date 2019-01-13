package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164454.
 * @author Sean A. Irvine
 */
public class A164454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164454() {
    super(new long[] {1, -1, 1, -3, 2, -1, 2}, new long[] {13, 21, 34, 52, 79, 120, 179});
  }
}
