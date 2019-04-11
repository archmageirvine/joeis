package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042350 Numerators of continued fraction convergents to <code>sqrt(702)</code>.
 * @author Sean A. Irvine
 */
public class A042350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042350() {
    super(new long[] {-1, 0, 106, 0}, new long[] {26, 53, 2782, 5617});
  }
}
