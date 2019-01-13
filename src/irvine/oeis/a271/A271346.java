package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271346.
 * @author Sean A. Irvine
 */
public class A271346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271346() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {4, 6, 8, 12, 14, 16, 24});
  }
}
