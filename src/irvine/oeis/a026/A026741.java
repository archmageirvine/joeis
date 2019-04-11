package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026741 <code>a(n) = n</code> if n odd, <code>n/2</code> if n even.
 * @author Sean A. Irvine
 */
public class A026741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026741() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, 1, 3});
  }
}
