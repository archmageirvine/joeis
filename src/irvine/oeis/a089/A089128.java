package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089128 a(n) = gcd(6,n).
 * @author Sean A. Irvine
 */
public class A089128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089128() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {6, 1, 2, 3, 2, 1});
  }
}
