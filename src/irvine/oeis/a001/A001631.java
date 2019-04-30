package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001631 Tetranacci numbers: <code>a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4)</code>, with initial conditions <code>a(0..3) = (0, 0, 1, 0)</code>.
 * @author Sean A. Irvine
 */
public class A001631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001631() {
    super(new long[] {1, 1, 1, 1}, new long[] {0, 0, 1, 0});
  }
}
