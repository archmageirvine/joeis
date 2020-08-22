package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143055 The real part of complex sequence: a(n) = a(n-1) + (1+i)*a(n-2).
 * @author Sean A. Irvine
 */
public class A143055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143055() {
    super(new long[] {-2, -2, 1, 2}, new long[] {0, 1, 1, 2});
  }
}
