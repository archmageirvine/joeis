package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176222 <code>a(n) = (n^2-3*n+1+(-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A176222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176222() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 5, 10});
  }
}
