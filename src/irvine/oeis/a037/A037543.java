package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037543 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>1,2,1</code>.
 * @author Sean A. Irvine
 */
public class A037543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037543() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 12, 121, 1211});
  }
}
