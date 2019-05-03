package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045802 2-ish numbers (end in <code>03, 21, 29, 47)</code>.
 * @author Sean A. Irvine
 */
public class A045802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045802() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {3, 21, 29, 47, 103});
  }
}
