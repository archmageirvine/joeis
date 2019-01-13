package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017294.
 * @author Sean A. Irvine
 */
public class A017294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017294() {
    super(new long[] {1, -3, 3}, new long[] {4, 144, 484});
  }
}
