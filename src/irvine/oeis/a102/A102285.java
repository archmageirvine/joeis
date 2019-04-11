package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102285 G.f. <code>(1-x)/(7*x^2-6*x+1)</code>.
 * @author Sean A. Irvine
 */
public class A102285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102285() {
    super(new long[] {-7, 6}, new long[] {1, 5});
  }
}
