package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270307 Expansion of -(4*x^3+8*x^2+4*x+1)/(2*x^4+4*x^3+2*x^2-x-1).
 * @author Sean A. Irvine
 */
public class A270307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270307() {
    super(new long[] {2, 4, 2, -1}, new long[] {1, 3, 7, 7});
  }
}
