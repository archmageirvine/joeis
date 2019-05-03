package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086114 Number of <code>4 X n (0,1)</code> matrices such that each row and each column is nondecreasing or nonincreasing.
 * @author Sean A. Irvine
 */
public class A086114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086114() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {8, 64, 216, 528, 1080});
  }
}
