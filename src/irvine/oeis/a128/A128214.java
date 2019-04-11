package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128214 Expansion of <code>(1+2x+3x^2)/(1+x+x^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A128214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128214() {
    super(new long[] {-1, -2, -3, -2}, new long[] {1, 0, 0, -2});
  }
}
