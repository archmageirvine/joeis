package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128016 Expansion of <code>(1+x+x^2+x^3)/(1-x^2+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A128016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128016() {
    super(new long[] {-1, 0, 1, 0}, new long[] {1, 1, 2, 2});
  }
}
