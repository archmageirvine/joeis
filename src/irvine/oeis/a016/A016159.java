package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016159 Expansion of 1/((1-4x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016159() {
    super(new long[] {-48, 16}, new long[] {1, 16});
  }
}
