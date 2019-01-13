package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164496.
 * @author Sean A. Irvine
 */
public class A164496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164496() {
    super(new long[] {1, -1, 2, -2, 0, 2}, new long[] {13, 21, 35, 58, 96, 159});
  }
}
