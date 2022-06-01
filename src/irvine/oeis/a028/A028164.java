package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028164 Expansion of 1/((1-4x)(1-10x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028164() {
    super(new long[] {-5280, 2768, -494, 37}, new long[] {1, 37, 875, 16865});
  }
}
