package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037562 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,2,1</code>.
 * @author Sean A. Irvine
 */
public class A037562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037562() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 12, 61, 307});
  }
}
