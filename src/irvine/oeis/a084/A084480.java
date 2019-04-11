package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084480 Number of tilings of <code>a 4</code> X <code>2n</code> rectangle with L tetrominoes.
 * @author Sean A. Irvine
 */
public class A084480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084480() {
    super(new long[] {-2, -4, -4, -1, 2, 4}, new long[] {1, 2, 10, 42, 182, 790});
  }
}
