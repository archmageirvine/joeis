package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286983.
 * @author Sean A. Irvine
 */
public class A286983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286983() {
    super(new long[] {1, -1, -5, 1, 3}, new long[] {1, 2, 4, 9, 20});
  }
}
