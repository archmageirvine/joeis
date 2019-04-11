package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090381 Expansion of <code>(1+4x+7x^2)/((1-x)^2*(1-x^2))</code>.
 * @author Sean A. Irvine
 */
public class A090381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090381() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 6, 19, 36});
  }
}
