package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169672 Lexicographically earliest de Bruijn sequence for n = 5 and k = 2.
 * @author Sean A. Irvine
 */
public class A169672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169672() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1});
  }
}
