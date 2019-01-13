package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198400.
 * @author Sean A. Irvine
 */
public class A198400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198400() {
    super(new long[] {10, -21, 12}, new long[] {1, 0, 80});
  }
}
