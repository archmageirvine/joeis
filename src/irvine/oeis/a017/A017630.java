package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017630.
 * @author Sean A. Irvine
 */
public class A017630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017630() {
    super(new long[] {1, -3, 3}, new long[] {81, 441, 1089});
  }
}
