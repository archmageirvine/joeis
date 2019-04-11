package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041198 Numerators of continued fraction convergents to <code>sqrt(110)</code>.
 * @author Sean A. Irvine
 */
public class A041198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041198() {
    super(new long[] {-1, 0, 42, 0}, new long[] {10, 21, 430, 881});
  }
}
