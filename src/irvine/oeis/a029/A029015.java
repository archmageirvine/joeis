package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029015 Expansion of 1/((1-x)(1-x^2)(1-x^5)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029015() {
    super(new long[] {-1, 1, 1, -1, 0, 1, -1, -1, 1, 0, 0, 1, -1, -1, 1, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 18, 21, 24, 27, 30});
  }
}
