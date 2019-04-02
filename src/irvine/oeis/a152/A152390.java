package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152390 Arises in enumerating non-degenerate colorings in Brook's Theorem.
 * @author Sean A. Irvine
 */
public class A152390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152390() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 68, 252, 648, 1370});
  }
}
