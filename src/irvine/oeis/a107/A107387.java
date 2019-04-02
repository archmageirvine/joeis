package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107387 Expansion of x*(1-2*x-x^2)/( (1-x)*(1+x)*(1-3*x+x^2)).
 * @author Sean A. Irvine
 */
public class A107387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107387() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 1, 1, 2});
  }
}
