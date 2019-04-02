package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291010 p-INVERT of (1,1,1,1,1,...), where p(S) = (1 - 2 S)(1 - 3 S).
 * @author Sean A. Irvine
 */
public class A291010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291010() {
    super(new long[] {-12, 7}, new long[] {5, 24});
  }
}
