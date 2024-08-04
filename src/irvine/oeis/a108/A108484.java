package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108484 a(n) = Sum_{k=0..floor(n/2)} binomial(2n-2k,2k) * 3^(n-k).
 * @author Sean A. Irvine
 */
public class A108484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108484() {
    super(new long[] {-9, 6, 5, 2}, new long[] {1, 1, 4, 19});
  }
}
