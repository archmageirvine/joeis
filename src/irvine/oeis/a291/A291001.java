package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291001 p-INVERT of (1,1,1,1,1,...), where p(S) = 1 - 8*S^2.
 * @author Sean A. Irvine
 */
public class A291001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291001() {
    super(new long[] {7, 2}, new long[] {0, 8});
  }
}
