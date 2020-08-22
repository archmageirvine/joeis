package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153785 5 times heptagonal numbers: a(n) = 5*n*(5*n-3)/2.
 * @author Sean A. Irvine
 */
public class A153785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153785() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 35});
  }
}
