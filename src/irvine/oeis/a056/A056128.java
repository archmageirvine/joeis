package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056128 A second-order recursive sequence.
 * @author Sean A. Irvine
 */
public class A056128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056128() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 20, 174, 988, 4277, 15288, 47320, 130832, 330174, 772616, 1696396, 3527160});
  }
}
