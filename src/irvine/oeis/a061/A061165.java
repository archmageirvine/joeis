package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061165 Polynomial extrapolation of <code>2, 3, 5, 7, 11</code>.
 * @author Sean A. Irvine
 */
public class A061165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061165() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 3, 5, 7, 11});
  }
}
