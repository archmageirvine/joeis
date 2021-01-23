package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291023 p-INVERT of (1,1,1,1,1,...), where p(S) = 1 - 3 S^2 + 2 S^3.
 * @author Sean A. Irvine
 */
public class A291023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291023() {
    super(new long[] {-4, 0, 3}, new long[] {0, 3, 4});
  }
}
