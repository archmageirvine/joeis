package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097575.
 * @author Sean A. Irvine
 */
public class A097575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097575() {
    super(new long[] {1, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 1, 1, 2, 1, 2, 2, 3});
  }
}
