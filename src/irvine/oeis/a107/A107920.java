package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107920 Lucas and Lehmer numbers with parameters (1 +- sqrt(-7))/2.
 * @author Sean A. Irvine
 */
public class A107920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107920() {
    super(new long[] {-2, 1}, new long[] {0, 1});
  }
}
