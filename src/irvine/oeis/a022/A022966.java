package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022966 10-n.
 * @author Sean A. Irvine
 */
public class A022966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022966() {
    super(new long[] {-1, 2}, new long[] {10, 9});
  }
}
