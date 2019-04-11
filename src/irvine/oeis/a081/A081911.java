package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081911 <code>a(n) = 5^n*(n^2 - n + 50)/50</code>.
 * @author Sean A. Irvine
 */
public class A081911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081911() {
    super(new long[] {125, -75, 15}, new long[] {1, 5, 26});
  }
}
