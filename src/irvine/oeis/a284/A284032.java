package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284032 Poly-Bernoulli numbers B_n^(k) with k = -8.
 * @author Sean A. Irvine
 */
public class A284032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284032() {
    super(new long[] {-362880, 663696, -509004, 214676, -54649, 8624, -826, 44}, new long[] {1, 256, 12866, 354106, 7107302, 117437746, 1701740006, 22447207906L});
  }
}
