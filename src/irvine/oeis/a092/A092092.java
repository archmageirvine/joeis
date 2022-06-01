package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092092 Back and Forth Summant S(n, _3): a(n) = Sum_{i=0..floor(2n/3)} (n-3i).
 * @author Sean A. Irvine
 */
public class A092092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092092() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 1, 0, 3, 2, 0});
  }
}
