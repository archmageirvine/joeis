package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138199 <code>14^(2*n+1) + 3^(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A138199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138199() {
    super(new long[] {-1764, 205}, new long[] {17, 2771});
  }
}
