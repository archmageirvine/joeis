package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054487.
 * @author Sean A. Irvine
 */
public class A054487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054487() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 14, 90, 390, 1320, 3762, 9438, 21450, 45045});
  }
}
