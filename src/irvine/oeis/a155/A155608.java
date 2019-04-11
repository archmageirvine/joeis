package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155608 <code>10^n + 3^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A155608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155608() {
    super(new long[] {30, -43, 14}, new long[] {1, 12, 108});
  }
}
