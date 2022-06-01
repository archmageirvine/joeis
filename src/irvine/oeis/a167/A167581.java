package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167581 The second left hand column of triangle A167580.
 * @author Sean A. Irvine
 */
public class A167581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167581() {
    super(new long[] {-16, 32, -24, 8}, new long[] {-1, 0, 28, 192});
  }
}
