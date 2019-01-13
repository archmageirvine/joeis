package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135532.
 * @author Sean A. Irvine
 */
public class A135532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135532() {
    super(new long[] {1, 2}, new long[] {-1, 3});
  }
}
