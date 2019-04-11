package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117188 Expansion of <code>(1-x^2)/(1+x^2+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A117188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117188() {
    super(new long[] {-1, 0, -1, 0}, new long[] {1, 0, -2, 0});
  }
}
