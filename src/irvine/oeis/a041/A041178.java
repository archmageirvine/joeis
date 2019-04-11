package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041178 Numerators of continued fraction convergents to <code>sqrt(99)</code>.
 * @author Sean A. Irvine
 */
public class A041178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041178() {
    super(new long[] {-1, 0, 20, 0}, new long[] {9, 10, 189, 199});
  }
}
