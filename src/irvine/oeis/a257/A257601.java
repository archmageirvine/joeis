package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257601 a(n) = (n^4 + 20*n^3 + 125*n^2 + 250*n + 24)/12.
 * @author Sean A. Irvine
 */
public class A257601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257601() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 35, 100, 210, 380});
  }
}
