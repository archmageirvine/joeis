package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154128 a(n) = 5^n*(n+4)!/n!.
 * @author Sean A. Irvine
 */
public class A154128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154128() {
    super(new long[] {3125, -3125, 1250, -250, 25}, new long[] {24, 600, 9000, 105000, 1050000});
  }
}
