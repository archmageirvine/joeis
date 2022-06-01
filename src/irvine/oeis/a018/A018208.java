package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018208 Expansion of 1/((1-3x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A018208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018208() {
    super(new long[] {396, -201, 26}, new long[] {1, 26, 475});
  }
}
