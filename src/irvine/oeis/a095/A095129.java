package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095129 <code>Jac(n)(2Jac(n)-1)</code>.
 * @author Sean A. Irvine
 */
public class A095129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095129() {
    super(new long[] {16, -4, -20, 5, 4}, new long[] {0, 1, 1, 15, 45});
  }
}
