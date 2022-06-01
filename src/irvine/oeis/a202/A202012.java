package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202012 Expansion of (1-x+x^2)/((1-x)(1-x-x^2-x^3)).
 * @author Sean A. Irvine
 */
public class A202012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202012() {
    super(new long[] {-1, 0, 0, 2}, new long[] {1, 1, 3, 6});
  }
}
