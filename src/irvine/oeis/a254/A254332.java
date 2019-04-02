package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254332 Indices of centered pentagonal numbers (A005891) which are also squares (A000290).
 * @author Sean A. Irvine
 */
public class A254332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254332() {
    super(new long[] {1, -1, -38, 38, 1}, new long[] {1, 3, 22, 96, 817});
  }
}
