package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078016 Expansion of <code>(1-x)/(1-x+x^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A078016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078016() {
    super(new long[] {-1, -1, 1}, new long[] {1, 0, -1});
  }
}
