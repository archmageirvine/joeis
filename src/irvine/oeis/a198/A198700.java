package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198700.
 * @author Sean A. Irvine
 */
public class A198700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198700() {
    super(new long[] {-10, 11}, new long[] {10, 109});
  }
}
