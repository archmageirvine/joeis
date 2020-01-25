package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157014 Expansion of <code>x*(1-x)/(1 - 22*x + x^2)</code>.
 * @author Sean A. Irvine
 */
public class A157014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157014() {
    super(new long[] {-1, 22}, new long[] {1, 21});
  }
}
