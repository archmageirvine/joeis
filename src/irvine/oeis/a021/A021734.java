package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021734 G.f.: 1/((1-x)(1-3x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021734() {
    super(new long[] {-396, 597, -227, 27}, new long[] {1, 27, 502, 8022});
  }
}
