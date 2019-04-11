package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130862 <code>a(n) = (n-1)*(n+2)*(2*n+11)/2</code>.
 * @author Sean A. Irvine
 */
public class A130862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130862() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 30, 85, 171});
  }
}
