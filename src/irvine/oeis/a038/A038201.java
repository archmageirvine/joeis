package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038201.
 * @author Sean A. Irvine
 */
public class A038201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038201() {
    super(new long[] {1, 0, 0, 0, -1, 0, 0, 0, -4, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 2, 3, 4, 5, 9, 12, 14, 15, 29, 41, 50, 55, 105, 146, 175});
  }
}
