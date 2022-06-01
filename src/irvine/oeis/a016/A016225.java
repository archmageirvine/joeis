package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016225 Expansion of 1/((1-x)(1-4x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A016225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016225() {
    super(new long[] {40, -54, 15}, new long[] {1, 15, 171});
  }
}
