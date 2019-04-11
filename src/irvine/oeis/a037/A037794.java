package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037794 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,2,1,0</code>.
 * @author Sean A. Irvine
 */
public class A037794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037794() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {3, 17, 86, 430, 2153});
  }
}
