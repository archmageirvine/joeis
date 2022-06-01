package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016933 a(n) = 6n + 2.
 * @author Sean A. Irvine
 */
public class A016933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016933() {
    super(new long[] {-1, 2}, new long[] {2, 8});
  }
}
