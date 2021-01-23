package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240926 a(n) = 2 + L(2*n) = 2 + A005248(n), n &gt;= 0, with the Lucas numbers (A000032).
 * @author Sean A. Irvine
 */
public class A240926 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A240926() {
    super(new long[] {1, -4, 4}, new long[] {4, 5, 9});
  }
}
