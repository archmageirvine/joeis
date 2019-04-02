package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238377 Row sums of triangle in A204028.
 * @author Sean A. Irvine
 */
public class A238377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238377() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 6, 10});
  }
}
