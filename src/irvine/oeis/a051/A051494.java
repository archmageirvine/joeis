package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051494 Expansion of (1-x+x^2+x^3)/(1-x^2)^3.
 * @author Sean A. Irvine
 */
public class A051494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051494() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, -1, 4, -2, 9, -3});
  }
}
