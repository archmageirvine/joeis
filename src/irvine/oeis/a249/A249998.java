package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249998 Expansion of 1/((1+x)*(1+3*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A249998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249998() {
    super(new long[] {12, 13, 0}, new long[] {1, 0, 13});
  }
}
