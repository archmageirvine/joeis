package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027650 Poly-Bernoulli numbers B_n^(k) with k=-3.
 * @author Sean A. Irvine
 */
public class A027650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027650() {
    super(new long[] {24, -26, 9}, new long[] {1, 8, 46});
  }
}
