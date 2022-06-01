package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016187 Expansion of 1/((1-8x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A016187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016187() {
    super(new long[] {-88, 19}, new long[] {1, 19});
  }
}
