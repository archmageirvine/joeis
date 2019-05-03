package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107241 Sum of squares of first n tetranacci numbers <code>(A000288)</code>.
 * @author Sean A. Irvine
 */
public class A107241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107241() {
    super(new long[] {-1, 1, 2, -2, 6, -2, -16, 6, 2, 2, 3}, new long[] {1, 2, 3, 4, 20, 69, 238, 863, 3264, 12100, 44861});
  }
}
