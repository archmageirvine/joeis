package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025774 Expansion of 1/((1-x)(1-x^4)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A025774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025774() {
    super(new long[] {1, -1, 0, 0, -1, 1, 0, 0, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 5, 6});
  }
}
