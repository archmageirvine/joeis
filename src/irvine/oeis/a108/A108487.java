package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108487 Sum binomial(2n-2k,2k)10^(n-k), k=0..floor(n/2).
 * @author Sean A. Irvine
 */
public class A108487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108487() {
    super(new long[] {-100, 200, -80, 20}, new long[] {1, 10, 110, 1600});
  }
}
