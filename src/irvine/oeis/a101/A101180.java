package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101180 Numbers n such that 19*n^2 + 19*n + 1 is a square.
 * @author Sean A. Irvine
 */
public class A101180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101180() {
    super(new long[] {1, -1, 0, 0, -115598, 115598, 0, 0, 1}, new long[] {0, 8, 671, 15639, 42159, 981911, 77624048, 1807894920, 4873553880L});
  }
}
