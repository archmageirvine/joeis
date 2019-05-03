package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264080 <code>a(n) = 6*F(n)*F(n+1) + (-1)^n</code>, where F <code>= A000045</code>.
 * @author Sean A. Irvine
 */
public class A264080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264080() {
    super(new long[] {-1, 2, 2}, new long[] {1, 5, 13});
  }
}
