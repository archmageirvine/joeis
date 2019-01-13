package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017557.
 * @author Sean A. Irvine
 */
public class A017557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017557() {
    super(new long[] {-1, 2}, new long[] {3, 15});
  }
}
