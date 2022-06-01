package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191566 a(n) = 7*a(n-1) + (-1)^n*6*2^(n-1).
 * @author Sean A. Irvine
 */
public class A191566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191566() {
    super(new long[] {14, 5}, new long[] {1, 1});
  }
}
