package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141036 Tribonacci-like sequence; a(0)=2, a(1)=1, a(2)=1, a(n) = a(n-1) + a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A141036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141036() {
    super(new long[] {1, 1, 1}, new long[] {2, 1, 1});
  }
}
