package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245561 a(n) = 5^n - ( (sqrt(5)*phi)^n + (sqrt(5)/phi)^n ) + 1, where phi = golden ratio A001622.
 * @author Sean A. Irvine
 */
public class A245561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245561() {
    super(new long[] {-25, 55, -40, 11}, new long[] {0, 1, 11, 76});
  }
}
