package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016963.
 * @author Sean A. Irvine
 */
public class A016963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016963() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {16384, 10000000, 268435456, 2494357888L, 13492928512L, 52523350144L, 163840000000L, 435817657216L});
  }
}
