package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201008 Triangular numbers, <code>T(m)</code>, that are five-sixths of another triangular number: <code>T(m)</code> such that <code>6*T(m)=5*T(k)</code> for some k.
 * @author Sean A. Irvine
 */
public class A201008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201008() {
    super(new long[] {1, -483, 483}, new long[] {0, 55, 26565});
  }
}
