package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200563 Expansion of -2*x*(1+4*x) / ((2*x-1)*(4*x^2+3*x+1)).
 * @author Sean A. Irvine
 */
public class A200563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200563() {
    super(new long[] {8, 2, -1}, new long[] {2, 6, -2});
  }
}
