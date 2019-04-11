package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033137 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>1,1,0</code>.
 * @author Sean A. Irvine
 */
public class A033137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033137() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 11, 110, 1101});
  }
}
