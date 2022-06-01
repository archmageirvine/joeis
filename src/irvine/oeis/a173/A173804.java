package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173804 a(n) = (5*10^n - 41)/9 for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A173804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173804() {
    super(new long[] {-10, 11}, new long[] {1, 51});
  }
}
