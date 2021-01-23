package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133628 a(1)=1, a(n) = a(n-1) + (p-1)*p^(n/2-1) if n is even, else a(n) = a(n-1) + p^((n-1)/2), where p=4.
 * @author Sean A. Irvine
 */
public class A133628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133628() {
    super(new long[] {-4, 4, 1}, new long[] {1, 4, 8});
  }
}
