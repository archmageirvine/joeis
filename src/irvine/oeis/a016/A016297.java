package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016297 Expansion of 1/((1-2x)(1-5x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016297() {
    super(new long[] {80, -66, 15}, new long[] {1, 15, 159});
  }
}
