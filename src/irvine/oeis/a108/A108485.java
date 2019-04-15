package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108485 Sum <code>binomial(2n-2k,2k)2^(n-k), k=0..floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A108485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108485() {
    super(new long[] {-4, 8, 0, 4}, new long[] {1, 2, 6, 32});
  }
}
