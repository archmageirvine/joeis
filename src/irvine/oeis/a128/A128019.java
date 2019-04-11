package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128019 Expansion of <code>(1-3x)/(1+3x^2)</code>.
 * @author Sean A. Irvine
 */
public class A128019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128019() {
    super(new long[] {-3, 0}, new long[] {1, -3});
  }
}
