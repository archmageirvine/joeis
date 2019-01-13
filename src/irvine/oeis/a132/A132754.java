package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132754.
 * @author Sean A. Irvine
 */
public class A132754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132754() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 25});
  }
}
