package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005232 Expansion of (1-x+x^2)/((1-x)^2*(1-x^2)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A005232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005232() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2}, new long[] {1, 1, 3, 4, 8, 10, 16, 20});
  }
}
