package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154292 Integers of the form m*(6*m -+ 1)/2.
 * @author Sean A. Irvine
 */
public class A154292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154292() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {11, 13, 46, 50, 105});
  }
}
