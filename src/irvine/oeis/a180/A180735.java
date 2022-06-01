package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180735 Expansion of (1+x)*(1-x)/(1 - x + x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A180735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180735() {
    super(new long[] {-1, -1, 1}, new long[] {1, 1, -1});
  }
}
