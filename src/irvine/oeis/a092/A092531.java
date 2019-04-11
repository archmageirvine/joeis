package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092531 Expansion of <code>(1+x^10)/((1-x)*(1-x^4)^2*(1-x^8))</code>.
 * @author Sean A. Irvine
 */
public class A092531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092531() {
    super(new long[] {-1, 1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1}, new long[] {1, 1, 1, 1, 3, 3, 3, 3, 7, 7, 8, 8, 14, 14, 16});
  }
}
