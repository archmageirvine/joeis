package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136429 <code>a(n) = Sum_{k=0..n} (F(k+1)^2 F(n-k+1)^2)</code> where <code>F(n) =</code> Fibonacci number <code>(A000045)</code>.
 * @author Sean A. Irvine
 */
public class A136429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136429() {
    super(new long[] {-1, 4, 0, -10, 0, 4}, new long[] {1, 2, 9, 26, 84, 250});
  }
}
