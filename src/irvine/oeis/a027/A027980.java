package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027980 <code>a(n) = Sum_{k=0..n-1} T(n,k)*T(n,2n-k)</code>, T given by <code>A027960</code>.
 * @author Sean A. Irvine
 */
public class A027980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027980() {
    super(new long[] {-1, 5, -5, -5, 5}, new long[] {1, 13, 48, 176, 580});
  }
}
