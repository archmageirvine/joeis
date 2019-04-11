package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213029 Floor(n/2)^2 <code>- floor(n/3)^2</code>.
 * @author Sean A. Irvine
 */
public class A213029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213029() {
    super(new long[] {1, 1, -1, -3, -2, 2, 3, 1, -1}, new long[] {0, 0, 1, 0, 3, 3, 5, 5, 12});
  }
}
