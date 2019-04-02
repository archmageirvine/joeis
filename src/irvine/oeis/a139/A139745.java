package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139745 a(n) = 11^n - 7^n.
 * @author Sean A. Irvine
 */
public class A139745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139745() {
    super(new long[] {-77, 18}, new long[] {0, 4});
  }
}
