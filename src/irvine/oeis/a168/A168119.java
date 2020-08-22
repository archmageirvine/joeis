package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168119 n*(n^10+1)/2.
 * @author Sean A. Irvine
 */
public class A168119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168119() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 1, 1025, 88575, 2097154, 24414065, 181398531, 988663375, 4294967300L, 15690529809L, 50000000005L, 142655835311L});
  }
}
