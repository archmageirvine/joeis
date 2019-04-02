package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221874 Numbers m such that 10*m^2 + 6 is a square.
 * @author Sean A. Irvine
 */
public class A221874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221874() {
    super(new long[] {-1, 0, 38, 0}, new long[] {1, 5, 43, 191});
  }
}
