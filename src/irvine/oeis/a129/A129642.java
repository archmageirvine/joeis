package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129642 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+457)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A129642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129642() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 348, 495, 1371, 3255, 4088, 9140});
  }
}
