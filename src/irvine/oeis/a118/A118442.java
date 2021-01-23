package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118442 Column 0 of triangle A118441, which is the matrix log of triangle A118435.
 * @author Sean A. Irvine
 */
public class A118442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118442() {
    super(new long[] {-16, 0, -8, 0}, new long[] {0, 1, -4, -12});
  }
}
