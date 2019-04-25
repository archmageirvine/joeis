package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275016 <code>a(n) = (2^n - (-1+i)^n - (-1-i)^n)/4 - 1</code> where i is the imaginary unit.
 * @author Sean A. Irvine
 */
public class A275016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275016() {
    super(new long[] {-4, 2, 2, 1}, new long[] {0, 0, 0, 5});
  }
}
