package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200998 Triangular numbers, T(m), that are three-quarters of another triangular number: T(m) such that 4*T(m)=3*T(k) for some k.
 * @author Sean A. Irvine
 */
public class A200998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200998() {
    super(new long[] {1, -195, 195}, new long[] {0, 21, 4095});
  }
}
