package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275016 a(n) = (2^n - (-1+i)^n - (-1-i)^n)/4 - 1 where i is the imaginary unit.
 * @author Sean A. Irvine
 */
public class A275016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275016() {
    super(1, new long[] {-4, 2, 2, 1}, new long[] {0, 0, 0, 5});
  }
}
