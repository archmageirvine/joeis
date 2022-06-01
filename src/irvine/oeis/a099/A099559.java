package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099559 a(n) = Sum_{k=0..floor(n/5)} C(n-4k,k+1).
 * @author Sean A. Irvine
 */
public class A099559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099559() {
    super(new long[] {-1, 1, 0, 0, -1, 2}, new long[] {0, 1, 2, 3, 4, 5});
  }
}
