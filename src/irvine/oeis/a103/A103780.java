package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103780 Row sums of square of trinomial triangle <code>A071675</code>.
 * @author Sean A. Irvine
 */
public class A103780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103780() {
    super(new long[] {1, 3, 6, 8, 8, 6, 4, 2, 1}, new long[] {1, 1, 3, 9, 25, 69, 189, 519, 1428});
  }
}
