package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020838 Expansion of 1/((1-7x)(1-8x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A020838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020838() {
    super(new long[] {560, -206, 25}, new long[] {1, 25, 419});
  }
}
