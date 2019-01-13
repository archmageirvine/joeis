package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017005.
 * @author Sean A. Irvine
 */
public class A017005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017005() {
    super(new long[] {-1, 2}, new long[] {2, 9});
  }
}
