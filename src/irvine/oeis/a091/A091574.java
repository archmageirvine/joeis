package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091574 Poincar&#233; series [or Poincare series] of the preprojective algebra of an extended Dynkin diagram of type D_4.
 * @author Sean A. Irvine
 */
public class A091574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091574() {
    super(new long[] {-1, 0, 2, 0}, new long[] {5, 8, 15, 16});
  }
}
