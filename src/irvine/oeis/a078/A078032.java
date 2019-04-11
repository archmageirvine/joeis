package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078032 Expansion of <code>(1-x)/(1+x^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A078032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078032() {
    super(new long[] {-1, -1, 0}, new long[] {1, -1, -1});
  }
}
