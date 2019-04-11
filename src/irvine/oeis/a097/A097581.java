package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097581 <code>a(n) = 3*2^floor((n-1)/2) + (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A097581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097581() {
    super(new long[] {2, 2, -1}, new long[] {2, 4, 5});
  }
}
