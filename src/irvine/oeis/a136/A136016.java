package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136016 a(n) = 9*n^2-1.
 * @author Sean A. Irvine
 */
public class A136016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136016() {
    super(new long[] {1, -3, 3}, new long[] {8, 35, 80});
  }
}
