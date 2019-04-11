package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191566 <code>a(n) = 7*a(n-1) + (-1)^n*6*2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A191566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191566() {
    super(new long[] {14, 5}, new long[] {1, 1});
  }
}
