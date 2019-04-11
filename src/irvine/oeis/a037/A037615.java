package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037615 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,3,2</code>.
 * @author Sean A. Irvine
 */
public class A037615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037615() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 11, 90, 721});
  }
}
