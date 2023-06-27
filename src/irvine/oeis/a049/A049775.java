package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049775 a(n) is the sum of all integers from 2^(n-2)+1 to 2^(n-1).
 * @author Sean A. Irvine
 */
public class A049775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049775() {
    super(2, new long[] {-8, 6}, new long[] {2, 7});
  }
}
