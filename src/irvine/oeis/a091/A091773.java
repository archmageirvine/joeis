package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091773 G.f.: Product((1+x^i)/(1-x^i),i=1..n-1)/(1-x^n), with n = 5.
 * @author Sean A. Irvine
 */
public class A091773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091773() {
    super(new long[] {1, -3, 3, -2, 3, -4, 4, -3, 2, -3, 3}, new long[] {1, 2, 4, 8, 14, 23, 36, 54, 78, 110, 151});
  }
}
