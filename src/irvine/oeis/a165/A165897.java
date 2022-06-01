package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165897 a(n) = a(n-1) + largest proper divisor of a(n-1), a(1)=4.
 * @author Sean A. Irvine
 */
public class A165897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165897() {
    super(new long[] {3, 0, 0}, new long[] {4, 6, 9});
  }
}
