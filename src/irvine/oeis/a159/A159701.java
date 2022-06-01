package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159701 Positive numbers y such that y^2 is of the form x^2+(x+967)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159701() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {925, 967, 1013, 4537, 4835, 5153});
  }
}
