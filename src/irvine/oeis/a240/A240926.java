package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240926 <code>a(n) = 2 +</code> L(2*n) <code>= 2 +</code> A005248(n), <code>n &gt;= 0,</code> with the Lucas numbers (A000032).
 * @author Sean A. Irvine
 */
public class A240926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240926() {
    super(new long[] {1, -4, 4}, new long[] {4, 5, 9});
  }
}
