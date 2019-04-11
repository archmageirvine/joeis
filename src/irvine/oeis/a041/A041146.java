package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041146 Numerators of continued fraction convergents to <code>sqrt(83)</code>.
 * @author Sean A. Irvine
 */
public class A041146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041146() {
    super(new long[] {-1, 0, 164, 0}, new long[] {9, 82, 1485, 13447});
  }
}
