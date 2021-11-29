package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198971 a(n) = 5*10^n - 1.
 * @author Sean A. Irvine
 */
public class A198971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198971() {
    super(new long[] {-10, 11}, new long[] {4, 49});
  }
}
