package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173804 <code>a(n) = (5*10^n - 41)/9</code> for <code>n &gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A173804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173804() {
    super(new long[] {-10, 11}, new long[] {1, 51});
  }
}
