package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024868 <code>a(n) = 2*(n+1) + 3*n +</code> ... <code>+ (k+1)*(n+2-k)</code>, where k <code>= [ n/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A024868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024868() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {6, 8, 22, 27, 52, 61, 100});
  }
}
