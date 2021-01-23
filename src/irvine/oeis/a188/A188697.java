package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188697 Expansion of (1+2*x^2)/(1-26*x+2*x^2-52*x^3+4*x^4).
 * @author Sean A. Irvine
 */
public class A188697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188697() {
    super(new long[] {-4, 52, -2, 26}, new long[] {1, 26, 676, 17576});
  }
}
