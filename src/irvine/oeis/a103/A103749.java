package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103749 Expansion of <code>x*(1+2*x)/(1+x+x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A103749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103749() {
    super(new long[] {2, -1, -1}, new long[] {0, 1, 1});
  }
}
