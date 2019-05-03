package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135991 Expansion of <code>x^3*(x-1)^2*(x+1) / (x^6-3*x^5+3*x^4-x+1)</code>.
 * @author Sean A. Irvine
 */
public class A135991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135991() {
    super(new long[] {-1, 3, -3, 0, 0, 1}, new long[] {0, 0, 1, 0, -1, 0});
  }
}
