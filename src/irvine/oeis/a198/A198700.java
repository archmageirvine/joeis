package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198700 11*10^n-1.
 * @author Sean A. Irvine
 */
public class A198700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198700() {
    super(new long[] {-10, 11}, new long[] {10, 109});
  }
}
