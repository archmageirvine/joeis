package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168392 <code>a(n) = 5 + 8*floor((n-1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A168392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168392() {
    super(new long[] {-1, 1, 1}, new long[] {5, 5, 13});
  }
}
