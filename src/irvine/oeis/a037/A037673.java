package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037673 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 3,2,0.
 * @author Sean A. Irvine
 */
public class A037673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037673() {
    super(new long[] {-10, 1, 0, 10}, new long[] {3, 32, 320, 3203});
  }
}
