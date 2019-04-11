package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135030 Generalized Fibonacci numbers: <code>a(n) = 6*a(n-1) + 2*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A135030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135030() {
    super(new long[] {2, 6}, new long[] {0, 1});
  }
}
