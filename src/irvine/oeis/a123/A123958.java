package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123958 Expansion of <code>x^3 / ( 1+2*x^2+2*x^3 )</code>.
 * @author Sean A. Irvine
 */
public class A123958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123958() {
    super(new long[] {-2, -2, 0}, new long[] {0, 0, 1});
  }
}
