package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198694.
 * @author Sean A. Irvine
 */
public class A198694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198694() {
    super(new long[] {-4, 5}, new long[] {6, 27});
  }
}
