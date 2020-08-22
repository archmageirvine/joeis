package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273053 Numbers n such that 15*n^2 + 16 is a square.
 * @author Sean A. Irvine
 */
public class A273053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273053() {
    super(new long[] {-1, 8}, new long[] {0, 4});
  }
}
