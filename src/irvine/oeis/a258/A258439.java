package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258439.
 * @author Sean A. Irvine
 */
public class A258439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258439() {
    super(new long[] {-6, 0, 5, 0}, new long[] {1, 1, 3, 2});
  }
}
