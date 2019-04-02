package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198275 17*2^n - 1.
 * @author Sean A. Irvine
 */
public class A198275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198275() {
    super(new long[] {-2, 3}, new long[] {16, 33});
  }
}
