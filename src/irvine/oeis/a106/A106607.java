package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106607 Expansion of (1+t^3)^2/((1-t)*(1-t^2)^2*(1-t^4)).
 * @author Sean A. Irvine
 */
public class A106607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106607() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {1, 1, 3, 5, 9, 13, 20});
  }
}
