package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017329.
 * @author Sean A. Irvine
 */
public class A017329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017329() {
    super(new long[] {-1, 2}, new long[] {5, 15});
  }
}
