package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037589 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 3,1.
 * @author Sean A. Irvine
 */
public class A037589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037589() {
    super(new long[] {-10, 1, 10}, new long[] {3, 31, 313});
  }
}
