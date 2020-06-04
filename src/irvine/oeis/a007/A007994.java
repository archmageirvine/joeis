package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007994 Poincar\u00e9 series [or Poincare series] of Lie algebra associated with a certain braid group.
 * @author Sean A. Irvine
 */
public class A007994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007994() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10},
      new long[] {4, 22, 110, 453, 1482, 4083, 9926, 21959, 45122, 87347}
    );
  }
}
