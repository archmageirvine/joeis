package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033126 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,1.
 * @author Sean A. Irvine
 */
public class A033126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033126() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 8, 65, 521});
  }
}
