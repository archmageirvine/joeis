package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253262 Expansion of <code>(x + x^2 + x^3) / (1 - x + x^2 - x^3 + x^4)</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A253262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253262() {
    super(new long[] {-1, 1, -1, 1}, new long[] {0, 1, 2, 2});
  }
}
