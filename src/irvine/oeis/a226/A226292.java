package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226292 (10*n^2+4*n+(1-(-1)^n))/8.
 * @author Sean A. Irvine
 */
public class A226292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226292() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 6, 13, 22});
  }
}
