package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023949 Expansion of 1/((1-x)(1-6x)(1-7x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A023949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023949() {
    super(new long[] {-336, 482, -167, 22}, new long[] {1, 22, 317, 3782});
  }
}
