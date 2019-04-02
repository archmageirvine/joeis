package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053730 2^(n-2)*(n^2-n+4).
 * @author Sean A. Irvine
 */
public class A053730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053730() {
    super(new long[] {8, -12, 6}, new long[] {1, 2, 6});
  }
}
