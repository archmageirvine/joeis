package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138200 <code>a(n) = (14^(2*n+1) + 3^(2*n+1)) / 17</code>.
 * @author Sean A. Irvine
 */
public class A138200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138200() {
    super(new long[] {-1764, 205}, new long[] {1, 163});
  }
}
