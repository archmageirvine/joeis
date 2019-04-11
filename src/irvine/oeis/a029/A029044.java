package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029044 Expansion of <code>1/((1-x)(1-x^3)(1-x^5)(1-x^12))</code>.
 * @author Sean A. Irvine
 */
public class A029044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029044() {
    super(new long[] {-1, 1, 0, 1, -1, 1, -1, 0, -1, 1, 0, 0, 1, -1, 0, -1, 1, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 10, 11, 12, 15, 16, 18, 21, 22, 25});
  }
}
