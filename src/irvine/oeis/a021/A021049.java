package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021049 Expansion of 1/((1-x)(1-2x)(1-3x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A021049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021049() {
    super(new long[] {-60, 116, -71, 16}, new long[] {1, 16, 185, 1940});
  }
}
