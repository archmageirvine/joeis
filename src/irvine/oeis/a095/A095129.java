package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095129 Jac(n)(2Jac(n)-1).
 * @author Sean A. Irvine
 */
public class A095129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095129() {
    super(new long[] {16, -4, -20, 5, 4}, new long[] {0, 1, 1, 15, 45});
  }
}
