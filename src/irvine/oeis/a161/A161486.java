package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161486 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+191)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A161486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161486() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 69, 336, 573, 936, 2449, 3820});
  }
}
