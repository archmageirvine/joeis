package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100855 n*(n^3-n^2+n+1)/2.
 * @author Sean A. Irvine
 */
public class A100855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100855() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 7, 33, 106});
  }
}
