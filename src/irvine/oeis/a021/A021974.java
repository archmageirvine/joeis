package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021974 Expansion of 1/((1-x)(1-4x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021974() {
    super(new long[] {-432, 624, -217, 26}, new long[] {1, 26, 459, 6916});
  }
}
