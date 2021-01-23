package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129837 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+119)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A129837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129837() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 24, 49, 57, 85, 136, 180, 196, 261, 357, 481, 616, 660, 816, 1105, 1357, 1449, 1824, 2380});
  }
}
