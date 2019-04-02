package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024440 Expansion of 1/((1-x)(1-7x)(1-8x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A024440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024440() {
    super(new long[] {-672, 908, -263, 28}, new long[] {1, 28, 521, 8132});
  }
}
