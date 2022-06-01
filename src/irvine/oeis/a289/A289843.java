package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289843 p-INVERT of (1,0,2,0,3,0,4,0,5,...) (A027656), where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289843() {
    super(new long[] {-1, 0, 4, 1, -6, -2, 5, 1}, new long[] {1, 2, 5, 13, 29, 73, 168, 410});
  }
}
