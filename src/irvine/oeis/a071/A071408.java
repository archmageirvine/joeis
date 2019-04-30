package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071408 <code>a(n+1) - 2*a(n) + a(n-1) = (2/3)*(1 +</code> w^(n+1) + w^(2*n+2)) with <code>a(1)=0, a(2)=1</code>, and where w is the imaginary cubic root of unity.
 * @author Sean A. Irvine
 */
public class A071408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071408() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 4, 7, 10});
  }
}
