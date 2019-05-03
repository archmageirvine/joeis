package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133265 Diagonal of the <code>A135356</code> triangle.
 * @author Sean A. Irvine
 */
public class A133265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133265() {
    super(new long[] {-1, 0, 2, 0}, new long[] {2, 2, 2, 4});
  }
}
