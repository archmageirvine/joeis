package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017932 Expansion of 1/((1-3x)(1-6x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A017932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017932() {
    super(new long[] {144, -90, 17}, new long[] {1, 17, 199});
  }
}
