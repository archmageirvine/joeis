package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221875 Numbers m such that 10*m^2 - 6 is a square.
 * @author Sean A. Irvine
 */
public class A221875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221875() {
    super(new long[] {-1, 0, 38, 0}, new long[] {1, 7, 31, 265});
  }
}
