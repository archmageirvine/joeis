package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016298 Expansion of 1/((1-2x)(1-5x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A016298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016298() {
    super(new long[] {90, -73, 16}, new long[] {1, 16, 183});
  }
}
