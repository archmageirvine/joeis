package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007068 a(n) = a(n-1) + (3+(-1)^n)*a(n-2)/2.
 * @author Sean A. Irvine
 */
public class A007068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007068() {
    super(new long[] {-2, 0, 4, 0}, new long[] {1, 3, 4, 10});
  }
}

