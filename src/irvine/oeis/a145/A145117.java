package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145117 Numbers of length n binary words with fewer than 9 0-digits between any pair of consecutive 1-digits.
 * @author Sean A. Irvine
 */
public class A145117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145117() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -2, 3}, new long[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024});
  }
}
