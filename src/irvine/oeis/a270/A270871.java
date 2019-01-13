package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270871.
 * @author Sean A. Irvine
 */
public class A270871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270871() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {8, 691, 5030, 25511, 100372, 324323, 898706, 2206135});
  }
}
