package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028178 Expansion of 1/((1-5x)(1-6x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028178() {
    super(new long[] {-3600, 1980, -392, 33}, new long[] {1, 33, 697, 12045});
  }
}
