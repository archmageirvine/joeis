package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052970 Expansion of <code>(1-2x)/(1-2x-2x^2+2x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052970() {
    super(new long[] {-2, 2, 2}, new long[] {1, 0, 2});
  }
}
