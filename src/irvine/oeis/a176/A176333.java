package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176333 Expansion of (1-3*x)/(1-4*x+9*x^2).
 * @author Sean A. Irvine
 */
public class A176333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176333() {
    super(new long[] {-9, 4}, new long[] {1, 1});
  }
}
