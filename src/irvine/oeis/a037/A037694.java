package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037694 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>1,2,0,3</code>.
 * @author Sean A. Irvine
 */
public class A037694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037694() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {1, 12, 120, 1203, 12031});
  }
}
