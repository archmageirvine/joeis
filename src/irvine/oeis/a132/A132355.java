package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132355 Numbers of the form 9*h^2 + 2*h, for h an integer.
 * @author Sean A. Irvine
 */
public class A132355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132355() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 7, 11, 32, 40});
  }
}
