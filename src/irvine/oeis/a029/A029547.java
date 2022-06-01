package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029547 Expansion of 1/(1-34*x+x^2).
 * @author Sean A. Irvine
 */
public class A029547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029547() {
    super(new long[] {-1, 34}, new long[] {1, 34});
  }
}
