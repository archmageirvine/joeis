package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021814 Expansion of 1/((1-x)(1-4x)(1-6x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A021814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021814() {
    super(new long[] {-192, 296, -122, 19}, new long[] {1, 19, 239, 2519});
  }
}
