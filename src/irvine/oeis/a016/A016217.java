package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016217 Expansion of 1 / ((1-x) * (1-3*x) * (1-12*x)).
 * @author Sean A. Irvine
 */
public class A016217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016217() {
    super(new long[] {36, -51, 16}, new long[] {1, 16, 205});
  }
}
