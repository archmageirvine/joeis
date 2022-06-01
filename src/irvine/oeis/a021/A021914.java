package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021914 Expansion of 1/((1-x)(1-4x)(1-8x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A021914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021914() {
    super(new long[] {-320, 472, -174, 23}, new long[] {1, 23, 355, 4635});
  }
}
