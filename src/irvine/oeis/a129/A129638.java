package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129638.
 * @author Sean A. Irvine
 */
public class A129638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129638() {
    super(new long[] {1, 3, -6, -4, 5, 1}, new long[] {11, 21, 40, 77, 148, 286});
  }
}
