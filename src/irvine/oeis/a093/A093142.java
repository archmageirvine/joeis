package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093142 Expansion of (1-5x)/((1-x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A093142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093142() {
    super(new long[] {-10, 11}, new long[] {1, 6});
  }
}
