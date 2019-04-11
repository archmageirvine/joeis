package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107920 Lucas and Lehmer numbers with parameters <code>(1+-sqrt(-7))/2</code>.
 * @author Sean A. Irvine
 */
public class A107920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107920() {
    super(new long[] {-2, 1}, new long[] {0, 1});
  }
}
