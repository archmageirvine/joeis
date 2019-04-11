package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128213 Expansion of <code>(1-x+2x^2-2x^3)/(1-x+x^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A128213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128213() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 1, 1, -1});
  }
}
