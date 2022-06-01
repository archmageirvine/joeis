package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095126 Expansion of x*(4+5*x-x^2)/ (1-2*x-3*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A095126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095126() {
    super(new long[] {-1, 3, 2}, new long[] {4, 13, 37});
  }
}
