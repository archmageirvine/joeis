package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037686 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,3,2.
 * @author Sean A. Irvine
 */
public class A037686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037686() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {1, 9, 84, 758, 6823});
  }
}
