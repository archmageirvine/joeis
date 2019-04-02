package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259158 Positive triangular numbers (A000217) that are heptagonal numbers (A000566) divided by 2.
 * @author Sean A. Irvine
 */
public class A259158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259158() {
    super(new long[] {1, -2079363, 2079363}, new long[] {171, 355817826, 739874066553765L});
  }
}
