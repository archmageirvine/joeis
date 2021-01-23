package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213659 a(n) = 3^n + 2^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A213659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213659() {
    super(new long[] {-12, 7}, new long[] {11, 41});
  }
}
