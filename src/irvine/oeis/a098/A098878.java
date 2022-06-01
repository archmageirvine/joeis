package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098878 a(n) = (2^n - 1)^3 - 2.
 * @author Sean A. Irvine
 */
public class A098878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098878() {
    super(new long[] {-64, 120, -70, 15}, new long[] {-2, -1, 25, 341});
  }
}
