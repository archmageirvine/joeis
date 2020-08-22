package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081894 Fourth binomial transform of C(n+2,2).
 * @author Sean A. Irvine
 */
public class A081894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081894() {
    super(new long[] {125, -75, 15}, new long[] {1, 7, 46});
  }
}
