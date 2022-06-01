package irvine.oeis.a283;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A283070 Sierpinski tetrahedron or tetrix numbers: a(n) = 2*4^n + 2.
 * @author Sean A. Irvine
 */
public class A283070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283070() {
    super(new long[] {-4, 5}, new long[] {4, 10});
  }
}
