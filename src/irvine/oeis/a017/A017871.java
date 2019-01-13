package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017871.
 * @author Sean A. Irvine
 */
public class A017871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017871() {
    super(new long[] {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1});
  }
}
