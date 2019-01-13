package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123190.
 * @author Sean A. Irvine
 */
public class A123190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123190() {
    super(new long[] {-108, 30, 34, -4}, new long[] {1, 0, 6, -6});
  }
}
