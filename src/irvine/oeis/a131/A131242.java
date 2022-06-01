package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131242 Partial sums of A059995: a(n) = sum_{k=0..n} floor(k/10).
 * @author Sean A. Irvine
 */
public class A131242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131242() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2});
  }
}
