package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081571 Sixth binomial transform of F(n+1).
 * @author Sean A. Irvine
 */
public class A081571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081571() {
    super(new long[] {-41, 13}, new long[] {1, 7});
  }
}
