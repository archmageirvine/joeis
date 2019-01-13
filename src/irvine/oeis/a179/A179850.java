package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179850.
 * @author Sean A. Irvine
 */
public class A179850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179850() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 0, 1, 1});
  }
}
