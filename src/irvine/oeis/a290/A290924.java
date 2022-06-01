package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290924 a(n) = (1/2)*A290923(n).
 * @author Sean A. Irvine
 */
public class A290924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290924() {
    super(new long[] {-1, 6, -8, 6}, new long[] {1, 5, 23, 104});
  }
}
