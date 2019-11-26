package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212704 <code>a(n) = 9*n*10^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A212704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212704() {
    super(new long[] {-100, 20}, new long[] {9, 180});
  }
}
