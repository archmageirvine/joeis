package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257863 Expansion of 1/(1 - x - x^2 + x^5 - x^6).
 * @author Sean A. Irvine
 */
public class A257863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257863() {
    super(new long[] {1, -1, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 7});
  }
}
