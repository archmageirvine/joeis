package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099560 a(n) = Sum_{k=0..floor(n/3)} C(n-2k,k-1).
 * @author Sean A. Irvine
 */
public class A099560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099560() {
    super(new long[] {-1, 0, -1, 2, 0, 1}, new long[] {0, 0, 0, 1, 1, 1});
  }
}
