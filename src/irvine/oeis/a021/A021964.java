package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021964 Expansion of 1/((1-x)(1-4x)(1-9x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021964() {
    super(new long[] {-396, 575, -203, 25}, new long[] {1, 25, 422, 6050});
  }
}
