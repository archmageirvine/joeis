package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047929 a(n) = n^2*(n-1)*(n-2).
 * @author Sean A. Irvine
 */
public class A047929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047929() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 18, 96, 300, 720});
  }
}
