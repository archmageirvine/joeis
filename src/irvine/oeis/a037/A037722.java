package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037722 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>2,0,1,3</code>.
 * @author Sean A. Irvine
 */
public class A037722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037722() {
    super(new long[] {-10, 11, -11, 11}, new long[] {2, 20, 201, 2013});
  }
}
