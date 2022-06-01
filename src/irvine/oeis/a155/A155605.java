package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155605 7^n+3^n-1.
 * @author Sean A. Irvine
 */
public class A155605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155605() {
    super(new long[] {21, -31, 11}, new long[] {1, 9, 57});
  }
}
