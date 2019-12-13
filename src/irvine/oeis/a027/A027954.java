package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027954 <code>a(n) = T(2n+1, n+2)</code>, T given by <code>A027948</code>.
 * @author Sean A. Irvine
 */
public class A027954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027954() {
    super(new long[] {-1, 7, -19, 26, -19, 7}, new long[] {5, 41, 189, 674, 2098, 6050}, 1);
  }
}
