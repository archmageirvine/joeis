package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185039 Numbers of the form 9*m^2 + 4*m, m an integer.
 * @author Sean A. Irvine
 */
public class A185039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185039() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 5, 13, 28, 44});
  }
}
