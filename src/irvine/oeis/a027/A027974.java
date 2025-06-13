package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027974 a(n) = Sum_{k=1..n+1} A027960(n+1, n+1+k).
 * @author Sean A. Irvine
 */
public class A027974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027974() {
    super(new long[] {-2, -1, 3}, new long[] {1, 5, 14});
  }
}
