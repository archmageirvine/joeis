package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122501 Expansion of <code>-x*(47*x^3+25*x^2+5*x+1)/(38*x^4+54*x^3+22*x^2-1)</code>.
 * @author Sean A. Irvine
 */
public class A122501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122501() {
    super(new long[] {38, 54, 22, 0}, new long[] {1, 5, 47, 211});
  }
}
