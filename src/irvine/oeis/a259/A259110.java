package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259110 2*A000447(n).
 * @author Sean A. Irvine
 */
public class A259110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259110() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 20, 70});
  }
}
