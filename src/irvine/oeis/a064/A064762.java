package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064762 <code>a(n) = 21*n^2</code>.
 * @author Sean A. Irvine
 */
public class A064762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064762() {
    super(new long[] {1, -3, 3}, new long[] {0, 21, 84});
  }
}
