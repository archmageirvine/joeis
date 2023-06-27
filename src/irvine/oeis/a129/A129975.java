package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129975 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+953)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A129975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129975() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 132, 2295, 2859, 3535, 15792, 19060});
  }
}
