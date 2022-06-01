package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198850 2*8^n-1.
 * @author Sean A. Irvine
 */
public class A198850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198850() {
    super(new long[] {-8, 9}, new long[] {1, 15});
  }
}
