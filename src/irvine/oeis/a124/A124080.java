package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124080 10 times triangular numbers: <code>a(n) = 5*n*(n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A124080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124080() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 30});
  }
}
