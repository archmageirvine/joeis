package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019333 Expansion of 1/((1-4x)(1-6x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A019333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019333() {
    super(new long[] {192, -104, 18}, new long[] {1, 18, 220});
  }
}
