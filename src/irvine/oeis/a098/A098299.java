package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098299.
 * @author Sean A. Irvine
 */
public class A098299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098299() {
    super(new long[] {1, -13, 13}, new long[] {0, 1, 14});
  }
}
