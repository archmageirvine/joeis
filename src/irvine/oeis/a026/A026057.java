package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026057 <code>a(n) = n*(n^2+12*n-25)/6</code>.
 * @author Sean A. Irvine
 */
public class A026057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026057() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, -2, 1, 10});
  }
}
