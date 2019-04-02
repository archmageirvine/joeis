package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255138 a(n) = (1 + 2^n*(3 + 2*(-1)^n))/3.
 * @author Sean A. Irvine
 */
public class A255138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255138() {
    super(new long[] {-4, 4, 1}, new long[] {2, 1, 7});
  }
}
