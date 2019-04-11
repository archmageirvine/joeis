package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137429 <code>a(n)= -2*a(n-1) -2*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A137429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137429() {
    super(new long[] {-2, -2}, new long[] {1, -4});
  }
}
