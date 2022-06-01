package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138147 Concatenation of n digits 1 and n digits 0.
 * @author Sean A. Irvine
 */
public class A138147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138147() {
    super(new long[] {-1000, 110}, new long[] {10, 1100});
  }
}
