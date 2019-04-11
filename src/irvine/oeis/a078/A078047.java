package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078047 Expansion of <code>(1-x)/(1+x+x^2+2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A078047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078047() {
    super(new long[] {-2, -1, -1}, new long[] {1, -2, 1});
  }
}
