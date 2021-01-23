package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072258 a(n) = ((6*n+1)*4^n - 1)/3.
 * @author Sean A. Irvine
 */
public class A072258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072258() {
    super(new long[] {16, -24, 9}, new long[] {0, 9, 69});
  }
}
