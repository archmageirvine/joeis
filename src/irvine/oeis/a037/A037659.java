package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037659 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 3,0,2.
 * @author Sean A. Irvine
 */
public class A037659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037659() {
    super(new long[] {-10, 1, 0, 10}, new long[] {3, 30, 302, 3023});
  }
}
