package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103819.
 * @author Sean A. Irvine
 */
public class A103819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103819() {
    super(new long[] {-2, -2, 1, 2, 2}, new long[] {0, 1, 3, 8, 23});
  }
}
