package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147833 Expansion of <code>(4*x^2+x-1)/(12*x^3+4*x^2+x-1)</code>.
 * @author Sean A. Irvine
 */
public class A147833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147833() {
    super(new long[] {12, 4, 1}, new long[] {1, 0, 0});
  }
}
