package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137224 Mix 4*n^2, 1+4*n^2, 1+(2n+1)^2, (2n+1)^2 (or A016742, A053755, A069894, A016754).
 * @author Sean A. Irvine
 */
public class A137224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137224() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 1, 2, 1, 4, 5, 10});
  }
}
