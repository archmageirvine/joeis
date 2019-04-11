package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213223 <code>10^n + 10*n</code>.
 * @author Sean A. Irvine
 */
public class A213223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213223() {
    super(new long[] {10, -21, 12}, new long[] {1, 20, 120});
  }
}
