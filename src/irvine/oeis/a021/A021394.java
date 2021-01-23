package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021394 Expansion of 1/((1-x)(1-3x)(1-4x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021394() {
    super(new long[] {-132, 221, -107, 19}, new long[] {1, 19, 254, 3014});
  }
}
