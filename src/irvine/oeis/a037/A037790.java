package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037790.
 * @author Sean A. Irvine
 */
public class A037790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037790() {
    super(new long[] {-8, 9, -9, 9}, new long[] {3, 26, 208, 1665});
  }
}
