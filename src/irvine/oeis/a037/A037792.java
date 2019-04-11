package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037792 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period 3,2,0,1.
 * @author Sean A. Irvine
 */
public class A037792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037792() {
    super(new long[] {-10, 11, -11, 11}, new long[] {3, 32, 320, 3201});
  }
}
