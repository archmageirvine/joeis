package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024178.
 * @author Sean A. Irvine
 */
public class A024178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024178() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {2, 11, 29, 61, 115, 196, 312});
  }
}
