package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262672 Expansion of (3-x-x^3) / ((x-1)^2*(1+x+x^2+x^3)).
 * @author Sean A. Irvine
 */
public class A262672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262672() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {3, 2, 2, 1, 4});
  }
}
