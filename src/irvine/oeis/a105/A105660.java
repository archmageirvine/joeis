package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105660 Expansion of g.f. (1-x)(x^2-5x+3)/(x^4-6x^3+13x^2-6x+1).
 * @author Sean A. Irvine
 */
public class A105660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105660() {
    super(new long[] {-1, 6, -13, 6}, new long[] {3, 10, 27, 49});
  }
}
