package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288309.
 * @author Sean A. Irvine
 */
public class A288309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288309() {
    super(new long[] {-3, 2, 2}, new long[] {2, 4, 8});
  }
}
