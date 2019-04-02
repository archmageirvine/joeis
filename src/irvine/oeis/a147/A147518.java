package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147518 Expansion of (1-x)/(1-4*x-6*x^2).
 * @author Sean A. Irvine
 */
public class A147518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147518() {
    super(new long[] {6, 4}, new long[] {1, 3});
  }
}
