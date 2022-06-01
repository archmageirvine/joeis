package irvine.oeis.a321;
// manually 2021-05-08

import irvine.oeis.recur.LinearRecurrence;

/**
 * A321959 a(n) = [x^n] ((1 - x)*x)/((1 - 2*x)^2*(2*x^2 - 2*x + 1)).
 * @author Georg Fischer
 */
public class A321959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A321959() {
    super(new long[] {-8, 16, -14, 6}, new long[] {0, 1, 5, 16});
  }
}
