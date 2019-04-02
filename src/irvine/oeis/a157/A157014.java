package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157014 Expansion of x*(1-x)/(x^2-22*x+1).
 * @author Sean A. Irvine
 */
public class A157014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157014() {
    super(new long[] {-1, 22}, new long[] {1, 21});
  }
}
