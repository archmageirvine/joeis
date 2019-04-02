package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042100 Numerators of continued fraction convergents to sqrt(574).
 * @author Sean A. Irvine
 */
public class A042100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042100() {
    super(new long[] {-1, 0, 0, 0, 1150, 0, 0, 0}, new long[] {23, 24, 551, 575, 27001, 27576, 633673, 661249});
  }
}
