package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017354.
 * @author Sean A. Irvine
 */
public class A017354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017354() {
    super(new long[] {1, -3, 3}, new long[] {49, 289, 729});
  }
}
