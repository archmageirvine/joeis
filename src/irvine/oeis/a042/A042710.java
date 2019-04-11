package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042710 Numerators of continued fraction convergents to <code>sqrt(885)</code>.
 * @author Sean A. Irvine
 */
public class A042710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042710() {
    super(new long[] {-1, 0, 0, 0, 238, 0, 0, 0}, new long[] {29, 30, 89, 119, 6991, 7110, 21211, 28321});
  }
}
