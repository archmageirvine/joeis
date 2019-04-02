package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200561 Expansion of -2*x / ( (2*x-1)*(4*x^2+3*x+1) ).
 * @author Sean A. Irvine
 */
public class A200561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200561() {
    super(new long[] {8, 2, -1}, new long[] {2, -2, 6});
  }
}
