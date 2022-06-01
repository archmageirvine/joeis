package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127261 a(0)=2, a(1)=2, a(n) = 2*a(n-1) + 10*a(n-2).
 * @author Sean A. Irvine
 */
public class A127261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127261() {
    super(new long[] {10, 2}, new long[] {2, 2});
  }
}
