package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020524 <code>a(n) =</code> 4th Euler polynomial evaluated at <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A020524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020524() {
    super(new long[] {256, -176, 26}, new long[] {0, 2, 132});
  }
}
