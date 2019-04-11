package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160444 G.f.: <code>x^2*(-1-x+x^2)/(-1+2*x^2+2*x^4)</code>.
 * @author Sean A. Irvine
 */
public class A160444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160444() {
    super(new long[] {2, 0, 2, 0}, new long[] {0, 1, 1, 1});
  }
}
