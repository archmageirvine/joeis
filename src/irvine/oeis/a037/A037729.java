package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037729 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>2,0,3,1</code>.
 * @author Sean A. Irvine
 */
public class A037729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037729() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {2, 20, 203, 2031, 20312});
  }
}
