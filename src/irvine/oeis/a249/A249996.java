package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249996 Expansion of <code>1/((1+2*x)*(1+3*x)*(1-4*x))</code>.
 * @author Sean A. Irvine
 */
public class A249996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249996() {
    super(new long[] {24, 14, -1}, new long[] {1, -1, 15});
  }
}
