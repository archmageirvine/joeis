package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257844 a(n) = floor(n/4) * (n mod 4).
 * @author Sean A. Irvine
 */
public class A257844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257844() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 1, 2, 3});
  }
}
