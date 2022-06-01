package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017916 Expansion of 1/((1-3x)(1-5x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A017916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017916() {
    super(new long[] {150, -95, 18}, new long[] {1, 18, 229});
  }
}
