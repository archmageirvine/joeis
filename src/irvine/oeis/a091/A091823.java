package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091823 <code>a(n) = 2*n^2 + 3*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A091823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091823() {
    super(new long[] {1, -3, 3}, new long[] {4, 13, 26});
  }
}
