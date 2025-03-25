package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081903 Fourth binomial transform of binomial(n+5, 5).
 * @author Sean A. Irvine
 */
public class A081903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081903() {
    super(new long[] {-15625, 18750, -9375, 2500, -375, 30}, new long[] {1, 10, 85, 660, 4830, 33876});
  }
}
