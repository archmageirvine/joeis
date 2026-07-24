package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156341 Expansion of 2*(1 - 3*x)/(1 - 12*x + 11*x^2).
 * @author Sean A. Irvine
 */
public class A156341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156341() {
    super(new long[] {-11, 12}, new long[] {2, 18});
  }
}
