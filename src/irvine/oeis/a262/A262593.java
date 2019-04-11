package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262593 Expansion of <code>(1-3*x)^3/((1-x)^4*(1-4*x))</code>.
 * @author Sean A. Irvine
 */
public class A262593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262593() {
    super(new long[] {4, -17, 28, -22, 8}, new long[] {1, -1, -3, -1, 13});
  }
}
