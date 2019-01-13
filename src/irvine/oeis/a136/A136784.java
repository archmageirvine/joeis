package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136784.
 * @author Sean A. Irvine
 */
public class A136784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136784() {
    super(new long[] {13, -21, 9}, new long[] {1, 3, 13});
  }
}
