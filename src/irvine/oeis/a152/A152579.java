package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152579 a(n) = (10*n+3)*(10*n+17).
 * @author Sean A. Irvine
 */
public class A152579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152579() {
    super(new long[] {1, -3, 3}, new long[] {51, 351, 851});
  }
}
