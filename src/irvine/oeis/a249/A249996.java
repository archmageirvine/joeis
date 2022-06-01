package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249996 Expansion of 1/((1+2*x)*(1+3*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A249996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249996() {
    super(new long[] {24, 14, -1}, new long[] {1, -1, 15});
  }
}
