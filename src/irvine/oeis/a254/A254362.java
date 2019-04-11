package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254362 <code>a(n) = 3*2^n + 3^n + 6</code>.
 * @author Sean A. Irvine
 */
public class A254362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254362() {
    super(new long[] {6, -11, 6}, new long[] {10, 15, 27});
  }
}
