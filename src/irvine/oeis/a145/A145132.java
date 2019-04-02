package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145132 Expansion of x/((1 - x - x^4)*(1 - x)^3).
 * @author Sean A. Irvine
 */
public class A145132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145132() {
    super(new long[] {-1, 3, -3, 0, 4, -6, 4}, new long[] {0, 1, 4, 10, 20, 36, 61});
  }
}
