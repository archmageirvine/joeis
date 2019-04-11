package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131242 Partial sums of A059995: <code>a(n) =</code> sum_{k=0..n} <code>floor(k/10)</code>.
 * @author Sean A. Irvine
 */
public class A131242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131242() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2});
  }
}
