package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129544 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+137)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A129544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129544() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 115, 136, 411, 1036, 1155, 2740});
  }
}
