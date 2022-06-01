package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133632 a(1)=1, a(n) = (p-1)*a(n-1), if n is even, otherwise a(n) = p*a(n-2), where p = 5.
 * @author Sean A. Irvine
 */
public class A133632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133632() {
    super(new long[] {5, 0}, new long[] {1, 4});
  }
}
