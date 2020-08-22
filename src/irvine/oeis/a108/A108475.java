package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108475 Expansion of (1-3*x) / (1-5*x-5*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A108475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108475() {
    super(new long[] {-1, 5, 5}, new long[] {1, 2, 15});
  }
}
