package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092550 Expansion of <code>-x*(1+x+x^2+x^4)/(-1+2*x^3+x^6)</code>.
 * @author Sean A. Irvine
 */
public class A092550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092550() {
    super(new long[] {1, 0, 0, 2, 0, 0}, new long[] {1, 1, 1, 2, 3, 2});
  }
}
