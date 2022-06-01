package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016178 Expansion of 1/((1-7x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A016178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016178() {
    super(new long[] {-63, 16}, new long[] {1, 16});
  }
}
