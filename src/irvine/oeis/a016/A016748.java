package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016748.
 * @author Sean A. Irvine
 */
public class A016748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016748() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 256, 65536, 1679616, 16777216, 100000000, 429981696, 1475789056, 4294967296L});
  }
}
