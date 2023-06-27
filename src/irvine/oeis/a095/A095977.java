package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095977 Expansion of 2*x / ((1+x)^2*(1-2*x)^2).
 * @author Sean A. Irvine
 */
public class A095977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095977() {
    super(1, new long[] {-4, -4, 3, 2}, new long[] {2, 4, 14, 32});
  }
}
