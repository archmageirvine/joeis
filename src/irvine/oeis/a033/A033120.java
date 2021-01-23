package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033120 Base-2 digits of a(n) are, in order, the first n terms of the periodic sequence with initial period 1,0,1.
 * @author Sean A. Irvine
 */
public class A033120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033120() {
    super(new long[] {-2, 1, 0, 2}, new long[] {1, 2, 5, 11});
  }
}
