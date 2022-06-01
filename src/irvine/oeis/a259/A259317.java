package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259317 a(n) = 2*(2*n+1)*A000538(n) - 4*A000330(n)^2.
 * @author Sean A. Irvine
 */
public class A259317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259317() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 2, 70, 588, 2772, 9438, 26026});
  }
}
