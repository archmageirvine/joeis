package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289846 p-INVERT of (1,0,1,0,1,0,1,0,1,...) (A059841), where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289846() {
    super(new long[] {-1, -1, 3, 1}, new long[] {1, 2, 4, 9});
  }
}
