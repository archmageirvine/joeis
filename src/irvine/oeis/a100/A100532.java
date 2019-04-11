package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100532 The first four numbers of this sequence are the primes <code>2,3,5,7.</code> The other terms are calculated by adding the previous four terms.
 * @author Sean A. Irvine
 */
public class A100532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100532() {
    super(new long[] {1, 1, 1, 1}, new long[] {2, 3, 5, 7});
  }
}
