package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247619.
 * @author Sean A. Irvine
 */
public class A247619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247619() {
    super(new long[] {2, -4, 1, 2}, new long[] {1, 6, 16, 36});
  }
}
