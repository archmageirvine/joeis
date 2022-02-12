package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107271 Let M = the 3 X 3 matrix [1 1 1; 3 1 0; 2 0 0]. Perform M^n * [1 0 0] getting (1, 3, 2; 6, 6, 2; 14, 24, 12; 50, 66, 28; ...) which we string together to form the sequence.
 * @author Sean A. Irvine
 */
public class A107271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107271() {
    super(new long[] {-2, 0, 0, 4, 0, 0, 2, 0, 0}, new long[] {1, 3, 2, 6, 6, 2, 14, 24, 12});
  }
}
