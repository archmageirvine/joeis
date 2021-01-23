package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061800 a(n) = n + (-1)^(n mod 3).
 * @author Sean A. Irvine
 */
public class A061800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061800() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 0, 3, 4});
  }
}
