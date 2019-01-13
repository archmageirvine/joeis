package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271389.
 * @author Sean A. Irvine
 */
public class A271389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271389() {
    super(new long[] {-1, 1, 4, -8, 5}, new long[] {0, 1, 6, 22, 66});
  }
}
