package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174784 Expansion of <code>x*(1-x+x^3+x^4)/(1+x^6)</code> (Period 12).
 * @author Sean A. Irvine
 */
public class A174784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174784() {
    super(new long[] {-1, 0, 0, 0, 0, 0}, new long[] {0, 1, -1, 0, 1, 1});
  }
}
