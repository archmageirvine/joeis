package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262000 <code>a(n) = n^2*(7*n - 5)/2</code>.
 * @author Sean A. Irvine
 */
public class A262000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262000() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 18, 72});
  }
}
