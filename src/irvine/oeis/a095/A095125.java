package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095125 Expansion of -x*(-1-x+x^2) / ( 1-2*x-3*x^2+x^3 ).
 * @author Sean A. Irvine
 */
public class A095125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095125() {
    super(1, new long[] {-1, 3, 2}, new long[] {1, 3, 8});
  }
}
