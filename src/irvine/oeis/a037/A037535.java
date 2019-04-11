package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037535 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>1,1,2</code>.
 * @author Sean A. Irvine
 */
public class A037535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037535() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 11, 112, 1121});
  }
}
