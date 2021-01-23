package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055156 Powers of 3 which are not powers of 3^3.
 * @author Sean A. Irvine
 */
public class A055156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055156() {
    super(new long[] {27, 0}, new long[] {3, 9});
  }
}
