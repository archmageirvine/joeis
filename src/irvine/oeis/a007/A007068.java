package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007068 <code>a(n) = a(n-1) + (3+(-1)^n)*a(n-2)/2</code>.
 * @author Sean A. Irvine
 */
public class A007068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007068() {
    super(new long[] {-2, 0, 4, 0}, new long[] {1, 3, 4, 10});
  }
}

