package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093140 Expansion of (1-6x)/((1-x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A093140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093140() {
    super(new long[] {-10, 11}, new long[] {1, 5});
  }
}
