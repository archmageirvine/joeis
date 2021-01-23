package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291015 p-INVERT of (1,1,1,1,1,...), where p(S) = (1 - S^3)^2.
 * @author Sean A. Irvine
 */
public class A291015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291015() {
    super(new long[] {1, -6, 5}, new long[] {2, 7, 23});
  }
}
