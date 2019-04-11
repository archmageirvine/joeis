package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249998 Expansion of <code>1/((1+x)*(1+3*x)*(1-4*x))</code>.
 * @author Sean A. Irvine
 */
public class A249998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249998() {
    super(new long[] {12, 13, 0}, new long[] {1, 0, 13});
  }
}
