package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017549.
 * @author Sean A. Irvine
 */
public class A017549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017549() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 537824, 11881376, 79235168, 312500000, 916132832});
  }
}
