package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226649 Fibonacci shuffles: a(2n) = A000071(n) and a(2n+1) = A001611(n+2).
 * @author Sean A. Irvine
 */
public class A226649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226649() {
    super(new long[] {1, 1, 1, 1, -1}, new long[] {0, 2, 0, 3, 1});
  }
}
