package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133265 Diagonal of the A135356 triangle.
 * @author Sean A. Irvine
 */
public class A133265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133265() {
    super(new long[] {-1, 0, 2, 0}, new long[] {2, 2, 2, 4});
  }
}
