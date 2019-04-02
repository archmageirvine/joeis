package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015225 Odd hexagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A015225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015225() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 7, 95, 161, 525, 715, 1547});
  }
}
