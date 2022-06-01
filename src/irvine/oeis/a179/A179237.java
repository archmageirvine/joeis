package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179237 a(0) = 1, a(1) = 2; a(n+1) =  6*a(n) + a(n-1) for n&gt;1.
 * @author Sean A. Irvine
 */
public class A179237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179237() {
    super(new long[] {1, 6}, new long[] {1, 2});
  }
}
