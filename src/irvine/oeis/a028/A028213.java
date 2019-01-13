package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028213.
 * @author Sean A. Irvine
 */
public class A028213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028213() {
    super(new long[] {-5280, 2548, -452, 35}, new long[] {1, 35, 773, 13783});
  }
}
