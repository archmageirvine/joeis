package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187340 Hankel transform of A014301(n+1).
 * @author Sean A. Irvine
 */
public class A187340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187340() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 2, 5, 5});
  }
}
