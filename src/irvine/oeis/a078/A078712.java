package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078712 Series expansion of (-3-2*x)/(1+x-x^3) in powers of x.
 * @author Sean A. Irvine
 */
public class A078712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078712() {
    super(new long[] {1, 0, -1}, new long[] {-3, 1, -1});
  }
}
