package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227524 Expansion of 1/((1-3x)(1-9x)(1-27x)).
 * @author Sean A. Irvine
 */
public class A227524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227524() {
    super(new long[] {729, -351, 39}, new long[] {1, 39, 1170});
  }
}
