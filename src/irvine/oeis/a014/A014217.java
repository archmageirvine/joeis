package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014217 a(n) = floor(phi^n), where phi = (1+sqrt(5))/2 is the golden ratio.
 * @author Sean A. Irvine
 */
public class A014217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014217() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 1, 2, 4});
  }
}
