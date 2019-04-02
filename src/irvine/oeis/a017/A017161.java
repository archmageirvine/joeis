package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017161 Expansion of 1/((1-3x)(1-4x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A017161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017161() {
    super(new long[] {144, -96, 19}, new long[] {1, 19, 265});
  }
}
