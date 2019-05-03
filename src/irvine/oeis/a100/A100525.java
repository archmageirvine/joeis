package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100525 Bisection of <code>A048654</code>.
 * @author Sean A. Irvine
 */
public class A100525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100525() {
    super(new long[] {-1, 6}, new long[] {4, 22});
  }
}
