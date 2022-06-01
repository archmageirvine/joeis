package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098581 Expansion of (1+2*x+4*x^2)/(1-x-8*x^4).
 * @author Sean A. Irvine
 */
public class A098581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098581() {
    super(new long[] {8, 0, 0, 1}, new long[] {1, 3, 7, 7});
  }
}
