package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042709 Denominators of continued fraction convergents to sqrt(884).
 * @author Sean A. Irvine
 */
public class A042709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042709() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3330, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 11, 15, 41, 56, 3289, 3345, 9979, 13324, 36627, 49951, 136529, 186480});
  }
}
