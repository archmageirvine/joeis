package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023951.
 * @author Sean A. Irvine
 */
public class A023951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023951() {
    super(new long[] {-420, 592, -195, 24}, new long[] {1, 24, 381, 5056});
  }
}
