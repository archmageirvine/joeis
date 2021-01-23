package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129625 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+233)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A129625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129625() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 75, 432, 699, 1092, 3115, 4660});
  }
}
