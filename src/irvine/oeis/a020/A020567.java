package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020567 Expansion of 1/((1-5x)(1-10x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A020567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020567() {
    super(new long[] {550, -215, 26}, new long[] {1, 26, 461});
  }
}
