package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108484 Sum binomial(2n-2k,2k)3^k, k=0..floor(n/2).
 * @author Sean A. Irvine
 */
public class A108484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108484() {
    super(new long[] {-9, 6, 5, 2}, new long[] {1, 1, 4, 19});
  }
}
