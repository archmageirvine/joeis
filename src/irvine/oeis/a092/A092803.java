package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092803 Expansion of (1-5x)/((1-2x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A092803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092803() {
    super(new long[] {-12, 8}, new long[] {1, 3});
  }
}
