package irvine.oeis.a222;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A222655 a(n) = 16n^4 + 4.
 * @author Sean A. Irvine
 */
public class A222655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222655() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4, 20, 260, 1300, 4100});
  }
}
