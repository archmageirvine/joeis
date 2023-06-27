package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266698 x-values of solutions to the Diophantine equation x^2 - 7*y^2 = 2.
 * @author Sean A. Irvine
 */
public class A266698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266698() {
    super(1, new long[] {-1, 16}, new long[] {3, 45});
  }
}
