package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020594 Expansion of 1/((1-6x)(1-8x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A020594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020594() {
    super(new long[] {576, -216, 26}, new long[] {1, 26, 460});
  }
}
