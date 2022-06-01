package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202206 a(n) = 3*a(n-1)+3*a(n-2) with a(0)=1 and a(1)=2.
 * @author Sean A. Irvine
 */
public class A202206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202206() {
    super(new long[] {3, 3}, new long[] {1, 2});
  }
}
