package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091573 Poincar\u00e9 series [or Poincare series] of the preprojective algebra of an extended Dynkin diagram of type E_6.
 * @author Sean A. Irvine
 */
public class A091573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091573() {
    super(new long[] {-1, 2, -2, 2}, new long[] {7, 12, 17, 24});
  }
}
