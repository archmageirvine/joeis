package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021114 Expansion of 1/((1-x)(1-2x)(1-5x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A021114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021114() {
    super(new long[] {-60, 112, -65, 14}, new long[] {1, 14, 131, 1036});
  }
}
