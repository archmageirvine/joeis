package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168411 <code>a(n) = 7 + 9*floor((n-1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A168411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168411() {
    super(new long[] {-1, 1, 1}, new long[] {7, 7, 16});
  }
}
