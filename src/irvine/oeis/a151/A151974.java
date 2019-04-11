package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151974 <code>a(n) = n*(n+1)*(n+2)*(n+3)*(n+4)/8</code>.
 * @author Sean A. Irvine
 */
public class A151974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151974() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 15, 90, 315, 840, 1890});
  }
}
