package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115032 Expansion of (5-14*x+x^2)/((1-x)*(x^2-18*x+1)).
 * @author Sean A. Irvine
 */
public class A115032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115032() {
    super(new long[] {1, -19, 19}, new long[] {5, 81, 1445});
  }
}
