package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021344 Expansion of 1/((1-x)(1-3x)(1-4x)(1-5x)).
 * @author Sean A. Irvine
 */
public class A021344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021344() {
    super(new long[] {-60, 107, -59, 13}, new long[] {1, 13, 110, 770});
  }
}
