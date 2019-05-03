package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261120 The number of distinct triple points in the set of function values <code>FLSN(m/6/7^n)</code>, m in <code>0, 1, 2... 6*7^n</code>, where <code>FLSN:[0,1]</code> is the "flowsnake" plane filling curve.
 * @author Sean A. Irvine
 */
public class A261120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261120() {
    super(new long[] {21, -31, 11}, new long[] {2, 17, 134});
  }
}
