package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104554 Expansion of x*(1-x)/(1-x+2*x^3-x^4).
 * @author Sean A. Irvine
 */
public class A104554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104554() {
    super(new long[] {1, -2, 0, 1}, new long[] {0, 1, 0, 0});
  }
}
