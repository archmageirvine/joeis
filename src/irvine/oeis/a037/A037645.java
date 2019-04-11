package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037645 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period 2,3,1.
 * @author Sean A. Irvine
 */
public class A037645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037645() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 23, 231, 2312});
  }
}
