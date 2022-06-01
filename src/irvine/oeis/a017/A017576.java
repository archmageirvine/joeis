package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017576 (12n+4)^8.
 * @author Sean A. Irvine
 */
public class A017576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017576() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {65536, 4294967296L, 377801998336L, 6553600000000L, 53459728531456L, 281474976710656L, 1113034787454976L, 3596345248055296L, 10000000000000000L});
  }
}
