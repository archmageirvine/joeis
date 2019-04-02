package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245437 Expansion of x^5/(x^6-x^4-x^2-x+1).
 * @author Sean A. Irvine
 */
public class A245437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245437() {
    super(new long[] {-1, 0, 1, 0, 1, 1}, new long[] {0, 0, 0, 0, 0, 1});
  }
}
