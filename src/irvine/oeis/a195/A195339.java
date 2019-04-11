package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195339 Expansion of <code>1/(1-4*x+2*x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A195339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195339() {
    super(new long[] {-1, -2, 0, 4}, new long[] {1, 4, 16, 62});
  }
}
