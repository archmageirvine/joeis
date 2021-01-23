package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028059 Expansion of 1/((1-3x)(1-5x)(1-7x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A028059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028059() {
    super(new long[] {-840, 673, -191, 23}, new long[] {1, 23, 338, 4054});
  }
}
