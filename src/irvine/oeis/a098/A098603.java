package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098603 <code>a(n) = n*(n+10)</code>.
 * @author Sean A. Irvine
 */
public class A098603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098603() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 24});
  }
}
