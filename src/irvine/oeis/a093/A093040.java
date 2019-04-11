package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093040 Expansion of <code>(1+x)/((1+x+x^2)(1-x-x^2))</code>.
 * @author Sean A. Irvine
 */
public class A093040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093040() {
    super(new long[] {1, 2, 1, 0}, new long[] {1, 1, 1, 3});
  }
}
