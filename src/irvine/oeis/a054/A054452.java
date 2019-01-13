package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054452.
 * @author Sean A. Irvine
 */
public class A054452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054452() {
    super(new long[] {-1, 5, -8, 5}, new long[] {0, 0, 1, 5});
  }
}
