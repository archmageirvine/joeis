package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257708 Numbers n such that <code>T(n) + T(n+1) +</code> ... <code>+ T(n+24)</code> is a square, where T <code>= A000217 (triangular</code> numbers).
 * @author Sean A. Irvine
 */
public class A257708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257708() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {25, 55, 208, 382, 1273});
  }
}
