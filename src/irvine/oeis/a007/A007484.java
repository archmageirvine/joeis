package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007484 a(n) = 3*a(n-1) + 2*a(n-2), with a(0)=2, a(1)=7.
 * @author Sean A. Irvine
 */
public class A007484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007484() {
    super(new long[] {2, 3}, new long[] {2, 7});
  }
}
