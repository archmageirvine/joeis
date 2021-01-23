package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105369 Expansion of ((1+x)^3 - x^3)/((1+x)^5 - x^5).
 * @author Sean A. Irvine
 */
public class A105369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105369() {
    super(new long[] {-5, -10, -10, -5}, new long[] {1, -2, 3, -5});
  }
}
