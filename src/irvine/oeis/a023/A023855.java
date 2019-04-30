package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023855 <code>a(n) = 1*(n) + 2*(n-1) + 3*(n-2) + ... + (n+1-k)*k</code>, where <code>k = floor((n+1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A023855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023855() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 7, 10, 22, 28, 50});
  }
}
