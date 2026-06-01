package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072818 Expansion of g.f. 20*x/(1-98*x+x^2).
 * @author Sean A. Irvine
 */
public class A072818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072818() {
    super(new long[] {-1, 98}, new long[] {0, 20});
  }
}
