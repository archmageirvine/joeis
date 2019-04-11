package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218992 Power ceiling sequence of <code>3+sqrt(10)</code>.
 * @author Sean A. Irvine
 */
public class A218992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218992() {
    super(new long[] {-1, -5, 7}, new long[] {7, 44, 272});
  }
}
