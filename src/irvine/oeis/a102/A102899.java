package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102899 <code>a(n) =</code> ceiling(n/3)^2 <code>- floor(n/3)^2</code>.
 * @author Sean A. Irvine
 */
public class A102899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102899() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 1, 0, 3, 3});
  }
}
