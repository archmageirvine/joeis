package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251733 <code>a(n) =</code> 3^n*A077985(n-1), A077985(-1) <code>= 0</code>. Irrational parts of the integers in <code>Q(sqrt(2))</code> giving the length of a L&#233;vy C-curve variant at iteration step n.
 * @author Sean A. Irvine
 */
public class A251733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251733() {
    super(new long[] {9, -6}, new long[] {0, 3});
  }
}
