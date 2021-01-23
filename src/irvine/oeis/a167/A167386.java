package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167386 a(n) = (-1)^n*n*(n+1)*(2*n-5)/6.
 * @author Sean A. Irvine
 */
public class A167386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167386() {
    super(new long[] {-1, -4, -6, -4}, new long[] {1, -1, -2, 10});
  }
}
