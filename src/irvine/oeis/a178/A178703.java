package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178703.
 * @author Sean A. Irvine
 */
public class A178703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178703() {
    super(new long[] {-3, 7, -8, 5}, new long[] {0, 0, 1, 5});
  }
}
