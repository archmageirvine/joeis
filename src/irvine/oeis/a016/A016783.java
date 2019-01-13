package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016783.
 * @author Sean A. Irvine
 */
public class A016783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016783() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 16384, 823543, 10000000, 62748517, 268435456, 893871739, 2494357888L});
  }
}
