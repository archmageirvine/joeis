package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134438 Number of tilings of a <code>3 X n</code> rectangle with n trominoes.
 * @author Sean A. Irvine
 */
public class A134438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134438() {
    super(new long[] {-1, 0, 1, 6, 2, 1}, new long[] {1, 1, 3, 10, 23, 62});
  }
}
