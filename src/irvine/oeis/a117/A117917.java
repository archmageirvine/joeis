package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117917 a(n) = 3*a(n-1) + a(n-2) + n.
 * @author Sean A. Irvine
 */
public class A117917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117917() {
    super(new long[] {1, 1, -6, 5}, new long[] {1, 4, 15, 52});
  }
}
