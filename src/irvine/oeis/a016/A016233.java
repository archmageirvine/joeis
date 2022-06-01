package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016233 Expansion of 1/((1-x)(1-5x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016233() {
    super(new long[] {40, -53, 14}, new long[] {1, 14, 143});
  }
}
