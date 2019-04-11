package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119330 Expansion of <code>(1-x)^2/((1-x)^4-2x^4)</code>.
 * @author Sean A. Irvine
 */
public class A119330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119330() {
    super(new long[] {1, 4, -6, 4}, new long[] {1, 2, 3, 4});
  }
}
