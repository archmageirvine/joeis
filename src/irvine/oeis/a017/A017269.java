package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017269 Expansion of 1/((1-3x)(1-5x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A017269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017269() {
    super(new long[] {90, -63, 14}, new long[] {1, 14, 133});
  }
}
