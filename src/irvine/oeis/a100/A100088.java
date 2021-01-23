package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100088 Expansion of (1-x^2)/((1-2x)(1+x^2)).
 * @author Sean A. Irvine
 */
public class A100088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100088() {
    super(new long[] {2, -1, 2}, new long[] {1, 2, 2});
  }
}
