package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037507 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,0</code>.
 * @author Sean A. Irvine
 */
public class A037507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037507() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 8, 48, 289});
  }
}
