package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033580 Four times second pentagonal numbers: <code>a(n) = 2*n*(3*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A033580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033580() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 28});
  }
}
