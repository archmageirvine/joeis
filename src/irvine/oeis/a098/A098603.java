package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098603 a(n) = n*(n+10).
 * @author Sean A. Irvine
 */
public class A098603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098603() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 24});
  }
}
