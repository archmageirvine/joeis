package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081632 2*3^n-(-1)^n.
 * @author Sean A. Irvine
 */
public class A081632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081632() {
    super(new long[] {3, 2}, new long[] {1, 7});
  }
}
