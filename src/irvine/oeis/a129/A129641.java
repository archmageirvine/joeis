package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129641 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+409)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A129641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129641() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 200, 611, 1227, 2291, 4620, 8180});
  }
}
