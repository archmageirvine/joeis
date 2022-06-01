package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028018 Expansion of 1/((1-2x)(1-8x)(1-10x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A028018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028018() {
    super(new long[] {-1760, 1436, -336, 31}, new long[] {1, 31, 625, 10395});
  }
}
