package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288465.
 * @author Sean A. Irvine
 */
public class A288465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288465() {
    super(new long[] {-1, 0, 0, 2}, new long[] {2, 4, 6, 10});
  }
}
