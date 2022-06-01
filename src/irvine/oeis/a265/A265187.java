package irvine.oeis.a265;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A265187 Nonnegative m for which 2*floor(m^2/11) = floor(2*m^2/11).
 * @author Sean A. Irvine
 */
public class A265187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265187() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 4, 5, 6, 7, 9, 10, 11});
  }
}
