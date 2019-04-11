package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110048 Expansion of <code>1/((2*x+1)*(1-4*x-4*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A110048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110048() {
    super(new long[] {8, 12, 2}, new long[] {1, 2, 16});
  }
}
