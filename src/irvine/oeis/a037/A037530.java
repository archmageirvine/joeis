package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037530 Base-5 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,1,2</code>.
 * @author Sean A. Irvine
 */
public class A037530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037530() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 6, 32, 161});
  }
}
