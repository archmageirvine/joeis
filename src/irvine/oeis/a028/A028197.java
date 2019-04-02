package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028197 Expansion of 1/((1-5x)(1-9x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028197() {
    super(new long[] {-5400, 2670, -473, 36}, new long[] {1, 36, 823, 15270});
  }
}
