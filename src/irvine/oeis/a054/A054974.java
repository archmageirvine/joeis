package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054974.
 * @author Sean A. Irvine
 */
public class A054974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054974() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 2, 6, 9, 17, 23});
  }
}
