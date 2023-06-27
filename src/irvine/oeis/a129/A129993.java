package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129993 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x+199)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A129993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129993() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 21, 504, 597, 704, 3441, 3980});
  }
}
