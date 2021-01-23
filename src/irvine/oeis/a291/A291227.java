package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291227 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - S - 2*S^2.
 * @author Sean A. Irvine
 */
public class A291227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291227() {
    super(new long[] {-1, -1, 4, 1}, new long[] {1, 3, 6, 17});
  }
}
