package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042624 Numerators of continued fraction convergents to <code>sqrt(842)</code>.
 * @author Sean A. Irvine
 */
public class A042624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042624() {
    super(new long[] {1, 58}, new long[] {29, 1683});
  }
}
