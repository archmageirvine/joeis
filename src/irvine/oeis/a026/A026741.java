package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026741 a(n) = n if n odd, n/2 if n even.
 * @author Sean A. Irvine
 */
public class A026741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026741() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, 1, 3});
  }
}
