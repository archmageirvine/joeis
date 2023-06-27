package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095265 A sequence generated from a 4th degree Pascal's Triangle polynomial.
 * @author Sean A. Irvine
 */
public class A095265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095265() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 22, 103, 284});
  }
}
