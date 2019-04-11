package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158496 Expansion of <code>(1-4x+x^2)/(1+x^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A158496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158496() {
    super(new long[] {-1, 0, -2, 0}, new long[] {1, -4, -1, 8});
  }
}
