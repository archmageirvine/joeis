package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014113 a(n) = a(n-1) + 2*a(n-2) with a(0)=0, a(1)=2.
 * @author Sean A. Irvine
 */
public class A014113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014113() {
    super(new long[] {2, 1}, new long[] {0, 2});
  }
}
