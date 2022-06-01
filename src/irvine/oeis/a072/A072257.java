package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072257 a(n) = ((6*n-17)*4^n - 1)/3.
 * @author Sean A. Irvine
 */
public class A072257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072257() {
    super(new long[] {16, -24, 9}, new long[] {-6, -15, -27});
  }
}
