package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016801 Expansion of 1/((1-3x)(1-4x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A016801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016801() {
    super(new long[] {84, -61, 14}, new long[] {1, 14, 135});
  }
}
