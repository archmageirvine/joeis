package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257448 <code>a(n) = 13*(2^n - 1) - 3*n^2 - 9*n</code>.
 * @author Sean A. Irvine
 */
public class A257448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257448() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 9, 37, 111});
  }
}
