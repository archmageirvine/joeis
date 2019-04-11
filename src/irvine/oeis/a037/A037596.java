package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037596 Numbers written in base 4 whose digits are, in order, the first n terms of the periodic sequence with initial period <code>1,0,3</code>.
 * @author Sean A. Irvine
 */
public class A037596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037596() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 10, 103, 1031});
  }
}
