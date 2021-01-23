package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017917 Expansion of 1/((1-3x)(1-5x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A017917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017917() {
    super(new long[] {165, -103, 19}, new long[] {1, 19, 258});
  }
}
