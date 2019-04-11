package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037742 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,3,0.
 * @author Sean A. Irvine
 */
public class A037742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037742() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {2, 19, 174, 1566, 14096});
  }
}
