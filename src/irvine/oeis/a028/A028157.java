package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028157 Expansion of 1/((1-4x)(1-8x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028157() {
    super(new long[] {-3456, 1968, -392, 33}, new long[] {1, 33, 697, 12033});
  }
}
