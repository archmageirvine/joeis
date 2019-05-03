package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179023 <code>a(n) = n(F(n+2) - 1)</code> where <code>F(n)</code> is defined by <code>A000045</code>.
 * @author Sean A. Irvine
 */
public class A179023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179023() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {0, 1, 4, 12, 28, 60});
  }
}
