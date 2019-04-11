package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017605 <code>a(n) = 12*n + 7</code>.
 * @author Sean A. Irvine
 */
public class A017605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017605() {
    super(new long[] {-1, 2}, new long[] {7, 19});
  }
}
