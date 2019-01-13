package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095265.
 * @author Sean A. Irvine
 */
public class A095265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095265() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 22, 103, 284});
  }
}
