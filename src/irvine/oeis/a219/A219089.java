package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219089.
 * @author Sean A. Irvine
 */
public class A219089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219089() {
    super(new long[] {1, -7, 22, -42, 57, -63, 64, -64, 64, -64, 64, -64, 64, -64, 64, -64, 63, -57, 42, -22, 7}, new long[] {0, 11, 244, 1838, 8303, 27680, 75418, 177978, 377149, 735091, 1340095, 2313060, 3814697, 6053445, 9294114, 13867245, 20179187, 28722900, 40089475, 54980371, 74220378});
  }
}
