package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129626 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+281)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A129626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129626() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 76, 559, 843, 1239, 3976, 5620});
  }
}
