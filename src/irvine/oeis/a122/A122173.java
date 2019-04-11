package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122173 Expansion of <code>-x * (x^5+x^4-15*x^3+19*x^2-8*x+1) / (x^6-12*x^5+34*x^4-30*x^3+6*x^2+3*x-1)</code>.
 * @author Sean A. Irvine
 */
public class A122173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122173() {
    super(new long[] {1, -12, 34, -30, 6, 3}, new long[] {1, -5, 10, -45, 110, -421});
  }
}
