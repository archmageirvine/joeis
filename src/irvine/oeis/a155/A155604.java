package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155604 6^n+3^n-1.
 * @author Sean A. Irvine
 */
public class A155604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155604() {
    super(new long[] {18, -27, 10}, new long[] {1, 8, 44});
  }
}
