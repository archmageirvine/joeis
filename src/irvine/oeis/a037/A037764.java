package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037764 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 3,0,1,2.
 * @author Sean A. Irvine
 */
public class A037764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037764() {
    super(1, new long[] {-10, 1, 0, 0, 10}, new long[] {3, 30, 301, 3012, 30123});
  }
}
