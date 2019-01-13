package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017881.
 * @author Sean A. Irvine
 */
public class A017881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017881() {
    super(new long[] {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1});
  }
}
