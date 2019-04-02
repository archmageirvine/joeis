package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075796 Numbers k such that 5*k^2 + 5 is a square.
 * @author Sean A. Irvine
 */
public class A075796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075796() {
    super(new long[] {-1, 18}, new long[] {2, 38});
  }
}
