package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254857 Octagonal numbers (A000567) that are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A254857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254857() {
    super(new long[] {1, -1, -674, 674, 1}, new long[] {1, 8, 736, 5461, 496133});
  }
}
