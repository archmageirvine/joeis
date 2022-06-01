package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216972 a(4n+2) = 2, otherwise a(n) = n.
 * @author Sean A. Irvine
 */
public class A216972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216972() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 5, 2, 7});
  }
}
