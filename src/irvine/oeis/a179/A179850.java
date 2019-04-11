package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179850 Characteristic function of numbers that are congruent to <code>{0, 1, 3, 4} mod 5</code>.
 * @author Sean A. Irvine
 */
public class A179850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179850() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 0, 1, 1});
  }
}
