package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221762 Numbers m such that 11*m^2 + 5 is a square.
 * @author Sean A. Irvine
 */
public class A221762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221762() {
    super(1, new long[] {-1, 0, 20, 0}, new long[] {1, 2, 22, 41});
  }
}
