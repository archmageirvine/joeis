package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141527 Expansion of x*(2 + x)/(1 + x + 41*x^2).
 * @author Sean A. Irvine
 */
public class A141527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141527() {
    super(1, new long[] {-41, -1}, new long[] {2, -1});
  }
}
