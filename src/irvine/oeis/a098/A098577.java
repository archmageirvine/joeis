package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098577 <code>a(n) =</code> Sum_{k=0..floor(n/5)} <code>C(n-3*k,2*k) * 2^k</code>.
 * @author Sean A. Irvine
 */
public class A098577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098577() {
    super(new long[] {2, 0, 0, -1, 2}, new long[] {1, 1, 1, 1, 1});
  }
}
