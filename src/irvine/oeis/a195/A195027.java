package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195027 a(n) = 2*n*(7*n + 5).
 * @author Sean A. Irvine
 */
public class A195027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195027() {
    super(new long[] {1, -3, 3}, new long[] {0, 24, 76});
  }
}
