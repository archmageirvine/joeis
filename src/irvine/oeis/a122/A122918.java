package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122918 Expansion of (1+x)^2/(1+x+x^2)^2.
 * @author Sean A. Irvine
 */
public class A122918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122918() {
    super(new long[] {-1, -2, -3, -2}, new long[] {1, 0, -2, 2});
  }
}
