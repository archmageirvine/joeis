package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104630 Expansion of <code>x/(1-5*x+7*x^2-5*x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A104630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104630() {
    super(new long[] {-1, 5, -7, 5}, new long[] {0, 1, 5, 18});
  }
}
