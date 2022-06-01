package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073313 Binomial transform of generalized Lucas numbers S(n) = S(n-1) + S(n-2) + S(n-3), S(0)=3, S(1)=1, S(2)=3.
 * @author Sean A. Irvine
 */
public class A073313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073313() {
    super(new long[] {2, -4, 4}, new long[] {3, 4, 8});
  }
}
