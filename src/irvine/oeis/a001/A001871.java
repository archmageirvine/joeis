package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001871 Expansion of <code>1/(1 - 3*x + x^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A001871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001871() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 6, 25, 90});
  }
}
