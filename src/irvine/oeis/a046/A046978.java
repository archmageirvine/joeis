package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046978 Numerators of Taylor series for exp(x)*sin(x).
 * @author Sean A. Irvine
 */
public class A046978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046978() {
    super(new long[] {-1, 0, 0, 0}, new long[] {0, 1, 1, 1});
  }
}
