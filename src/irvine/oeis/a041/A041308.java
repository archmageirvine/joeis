package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041308 Numerators of continued fraction convergents to <code>sqrt(167)</code>.
 * @author Sean A. Irvine
 */
public class A041308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041308() {
    super(new long[] {-1, 0, 0, 0, 336, 0, 0, 0}, new long[] {12, 13, 155, 168, 4187, 4355, 52092, 56447});
  }
}
