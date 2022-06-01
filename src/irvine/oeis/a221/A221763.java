package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221763 Numbers m such that 11*m^2 - 7 is a square.
 * @author Sean A. Irvine
 */
public class A221763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221763() {
    super(new long[] {-1, 0, 20, 0}, new long[] {1, 4, 16, 79});
  }
}
