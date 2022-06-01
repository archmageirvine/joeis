package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158223 a(n) = 196*n + 1.
 * @author Sean A. Irvine
 */
public class A158223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158223() {
    super(new long[] {-1, 2}, new long[] {197, 393});
  }
}
