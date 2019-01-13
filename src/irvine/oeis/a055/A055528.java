package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055528.
 * @author Sean A. Irvine
 */
public class A055528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055528() {
    super(new long[] {10, -41, 64, -46, 14}, new long[] {0, 1, 18, 207, 2134});
  }
}
