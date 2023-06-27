package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271649 a(n) = 2*(n^2 - n + 2).
 * @author Sean A. Irvine
 */
public class A271649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271649() {
    super(1, new long[] {1, -3, 3}, new long[] {4, 8, 16});
  }
}
