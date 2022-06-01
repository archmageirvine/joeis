package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145134 Expansion of x/((1 - x - x^4)*(1 - x)^5).
 * @author Sean A. Irvine
 */
public class A145134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145134() {
    super(new long[] {-1, 5, -10, 9, 1, -14, 20, -15, 6}, new long[] {0, 1, 6, 21, 56, 127, 259, 490, 876});
  }
}
