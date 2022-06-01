package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021864 Expansion of 1/((1-x)(1-4x)(1-7x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A021864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021864() {
    super(new long[] {-252, 379, -147, 21}, new long[] {1, 21, 294, 3466});
  }
}
