package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054894.
 * @author Sean A. Irvine
 */
public class A054894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054894() {
    super(new long[] {-1, -4, 4, 4}, new long[] {1, 2, 11, 48});
  }
}
