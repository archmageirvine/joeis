package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037678 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2,3.
 * @author Sean A. Irvine
 */
public class A037678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037678() {
    super(new long[] {-8, 9, -9, 9}, new long[] {1, 8, 66, 531});
  }
}
