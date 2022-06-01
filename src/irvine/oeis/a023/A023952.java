package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023952 Expansion of 1/((1-x)(1-6x)(1-7x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A023952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023952() {
    super(new long[] {-462, 647, -209, 25}, new long[] {1, 25, 416, 5822});
  }
}
