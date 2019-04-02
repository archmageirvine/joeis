package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021304 Expansion of 1/((1-x)(1-2x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021304() {
    super(new long[] {-216, 366, -173, 24}, new long[] {1, 24, 403, 5886});
  }
}
