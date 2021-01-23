package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124217 Expansion of (1-x-x^2)/(1-2x-x^2+x^4).
 * @author Sean A. Irvine
 */
public class A124217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124217() {
    super(new long[] {-1, 0, 1, 2}, new long[] {1, 1, 2, 5});
  }
}
