package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155624 11^n-3^n+1.
 * @author Sean A. Irvine
 */
public class A155624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155624() {
    super(new long[] {33, -47, 15}, new long[] {1, 9, 113});
  }
}
