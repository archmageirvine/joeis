package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158498.
 * @author Sean A. Irvine
 */
public class A158498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158498() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 3, 7});
  }
}
