package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097168 Expansion of (1-7x)/((1-x)(1-9x)(1-10x).
 * @author Sean A. Irvine
 */
public class A097168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097168() {
    super(new long[] {90, -109, 20}, new long[] {1, 13, 151});
  }
}
