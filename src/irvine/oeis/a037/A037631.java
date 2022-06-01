package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037631 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 2,3,0.
 * @author Sean A. Irvine
 */
public class A037631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037631() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 23, 230, 2302});
  }
}
