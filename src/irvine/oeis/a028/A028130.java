package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028130 Expansion of 1/((1-4x)(1-6x)(1-7x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A028130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028130() {
    super(new long[] {-1344, 920, -230, 25}, new long[] {1, 25, 395, 5045});
  }
}
