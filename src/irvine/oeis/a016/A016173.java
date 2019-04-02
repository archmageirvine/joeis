package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016173 Expansion of 1/((1-6x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A016173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016173() {
    super(new long[] {-60, 16}, new long[] {1, 16});
  }
}
