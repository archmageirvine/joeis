package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204631 Expansion of 1/(1 - x - x^2 + x^5 - x^7).
 * @author Sean A. Irvine
 */
public class A204631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204631() {
    super(new long[] {1, 0, -1, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 7, 11});
  }
}
