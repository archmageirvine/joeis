package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179611.
 * @author Sean A. Irvine
 */
public class A179611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179611() {
    super(new long[] {4, 8, 2}, new long[] {1, 4, 16});
  }
}
