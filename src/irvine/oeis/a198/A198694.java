package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198694 a(n) = 7*4^n-1.
 * @author Sean A. Irvine
 */
public class A198694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198694() {
    super(new long[] {-4, 5}, new long[] {6, 27});
  }
}
