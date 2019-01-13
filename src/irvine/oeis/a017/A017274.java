package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017274.
 * @author Sean A. Irvine
 */
public class A017274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017274() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1000000, 64000000, 729000000, 4096000000L, 15625000000L, 46656000000L});
  }
}
