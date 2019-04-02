package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092805 Expansion of (1+10x)/((1-x)(1-1000x^3)).
 * @author Sean A. Irvine
 */
public class A092805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092805() {
    super(new long[] {-1000, 1000, 0, 1}, new long[] {1, 11, 11, 1011});
  }
}
