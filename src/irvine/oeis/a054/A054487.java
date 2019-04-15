package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054487 <code>a(n) = (3*n+4)*C(n+7, 7)/4</code>.
 * @author Sean A. Irvine
 */
public class A054487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054487() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 14, 90, 390, 1320, 3762, 9438, 21450, 45045});
  }
}
