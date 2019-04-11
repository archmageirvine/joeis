package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289807 p-INVERT of <code>(1,2,2,3,3,4,4,...)</code> (A080513), where p(S) <code>= 1 -</code> S - S^2.
 * @author Sean A. Irvine
 */
public class A289807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289807() {
    super(new long[] {-1, 2, 1, -5, 2, 3}, new long[] {1, 4, 13, 42, 133, 424});
  }
}
