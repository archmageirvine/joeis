package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104720 Expansion of 1/((1-x)(1-x^2)(1-10x)).
 * @author Sean A. Irvine
 */
public class A104720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104720() {
    super(new long[] {10, -11, -9, 11}, new long[] {1, 11, 112, 1122});
  }
}
