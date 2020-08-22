package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016324 Expansion of 1/((1-2x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016324() {
    super(new long[] {216, -150, 23}, new long[] {1, 23, 379});
  }
}
