package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028097 Expansion of 1/((1-3x)(1-7x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028097() {
    super(new long[] {-2520, 1662, -361, 32}, new long[] {1, 32, 663, 11326});
  }
}
