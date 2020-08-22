package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257286 a(n) = 5*6^n-4*5^n.
 * @author Sean A. Irvine
 */
public class A257286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257286() {
    super(new long[] {-30, 11}, new long[] {1, 10});
  }
}
