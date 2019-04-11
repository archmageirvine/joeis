package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037664 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 3,1,0.
 * @author Sean A. Irvine
 */
public class A037664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037664() {
    super(new long[] {-8, 1, 0, 8}, new long[] {3, 25, 200, 1603});
  }
}
