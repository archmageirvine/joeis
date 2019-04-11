package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037591 Base-5 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,0,3</code>.
 * @author Sean A. Irvine
 */
public class A037591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037591() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 5, 28, 141});
  }
}
