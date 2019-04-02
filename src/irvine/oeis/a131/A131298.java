package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131298 A difference of Fibonacci and Padovan numbers.
 * @author Sean A. Irvine
 */
public class A131298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131298() {
    super(new long[] {-1, -2, 0, 2, 1}, new long[] {1, 1, 2, 4, 6});
  }
}
