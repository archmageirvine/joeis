package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020573 Expansion of <code>1/((1-6x)(1-7x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A020573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020573() {
    super(new long[] {462, -185, 24}, new long[] {1, 24, 391});
  }
}
