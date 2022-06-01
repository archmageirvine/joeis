package irvine.oeis.a264;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A264080 a(n) = 6*F(n)*F(n+1) + (-1)^n, where F = A000045.
 * @author Sean A. Irvine
 */
public class A264080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264080() {
    super(new long[] {-1, 2, 2}, new long[] {1, 5, 13});
  }
}
