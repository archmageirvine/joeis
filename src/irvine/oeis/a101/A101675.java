package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101675 Expansion of <code>(1 - x - x^2)/(1 + x^2 + x^4)</code>.
 * @author Sean A. Irvine
 */
public class A101675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101675() {
    super(new long[] {-1, 0, -1, 0}, new long[] {1, -1, -2, 1});
  }
}
