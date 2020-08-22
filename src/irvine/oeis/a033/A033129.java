package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033129 Base 2 digits are, in order, the first n terms of the periodic sequence with initial period [1,1,0].
 * @author Sean A. Irvine
 */
public class A033129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033129() {
    super(new long[] {-2, 1, 0, 2}, new long[] {0, 1, 3, 6});
  }
}
