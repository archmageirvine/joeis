package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027651 Poly-Bernoulli numbers B_n^(k) with k=-4.
 * @author Sean A. Irvine
 */
public class A027651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027651() {
    super(new long[] {-120, 154, -71, 14}, new long[] {1, 16, 146, 1066});
  }
}
