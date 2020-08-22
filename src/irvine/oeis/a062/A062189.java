package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062189 a(n) = 2 * 3^(n-2)*n*(1+2*n).
 * @author Sean A. Irvine
 */
public class A062189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062189() {
    super(new long[] {27, -27, 9}, new long[] {0, 2, 20});
  }
}
