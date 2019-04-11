package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041118 Numerators of continued fraction convergents to <code>sqrt(68)</code>.
 * @author Sean A. Irvine
 */
public class A041118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041118() {
    super(new long[] {-1, 0, 66, 0}, new long[] {8, 33, 536, 2177});
  }
}
